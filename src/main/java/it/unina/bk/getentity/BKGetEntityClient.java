package it.unina.bk.getentity;

import it.unina.bk.common.Namespace;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.xml.namespace.QName;

import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.json.JSONObject;
import org.json.XML;

@SuppressWarnings({ "resource", "deprecation" })
public class BKGetEntityClient extends AbstractMediator {

	private String urlGetEntity;

	private String urlGetContext;

	public boolean mediate(MessageContext context) {

		String xml = "";

		try {

			String USER_AGENT = "";

			ArrayList<Namespace> namespaces = new ArrayList<Namespace>();

			// Send GET request
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(urlGetContext);
			request.addHeader("User-Agent", USER_AGENT);
			System.out.println("Sending GET request to URL : " + urlGetContext);
			System.out.println("Request : " + request.toString());
			HttpResponse response = client.execute(request);
			System.out.println("Response Code : "
					+ response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getEntity().getContent()));

			// Use response to define namespaces
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {

				Namespace n = new Namespace();

				if (line.contains(": \"")) {
					String substr = ": \"";
					String before = line.substring(0, line.indexOf(substr));
					String after = line.substring(line.indexOf(substr)
							+ substr.length());

					n.setPrefix(before);
					n.setValue("\"" + after);
					namespaces.add(n);
				}

				result.append(line).append("\n");
			}

			// Prepare json message for getEntity
			JSONObject obj = new JSONObject();
			obj.put("rowkey", context.getEnvelope().getBody().getFirstElement()
					.getFirstChildWithName(new QName("place")).getText());

			// Send POST request
			HttpClient clientGetEntity = new DefaultHttpClient();
			HttpPost post = new HttpPost(urlGetEntity);
			post.setHeader("User-Agent", USER_AGENT);
			String json2getEntity = obj.toString();
			StringEntity params = new StringEntity(json2getEntity, "UTF-8");
			params.setContentType("application/json; charset=UTF-8");
			post.setEntity(params);
			System.out.println("Sending POST request to URL : " + urlGetEntity);
			System.out.println("Request : " + post.toString());
			System.out.println("Post message : " + json2getEntity);
			HttpResponse responseGetEntity = clientGetEntity.execute(post);
			System.out.println("Response Code : "
					+ responseGetEntity.getStatusLine().getStatusCode());

			BufferedReader rdGetEntity = new BufferedReader(
					new InputStreamReader(responseGetEntity.getEntity()
							.getContent()));

			StringBuffer resultGetEntity = new StringBuffer();
			line = "";
			while ((line = rdGetEntity.readLine()) != null) {
				resultGetEntity.append(line);
			}

			// Convert JSON response into XML response
			System.out.println("Response message : "
					+ resultGetEntity.toString());
			JSONObject json = new JSONObject(resultGetEntity.toString());
			// System.out.println(json.toString());
			xml = XML.toString(json);
			String namespaceList = "";
			for (Namespace namespace : namespaces) {
				namespace.setPrefix(namespace.getPrefix().toUpperCase());
				namespaceList += namespace.toString() + " ";
			}
			xml = "<response " + namespaceList + ">" + xml + "</response>";
			System.out.println("XML class mediator response : " + xml);

		} catch (Exception e) {
			System.out.println("Error in class mediator : " + e.toString());
			return false;
		}

		InputStream xmlInputStream = new ByteArrayInputStream(xml.toString()
				.getBytes());
		try {
			context.getEnvelope()
					.getBody()
					.addChild(
							new StAXOMBuilder(xmlInputStream)
									.getDocumentElement());
		} catch (final Exception e) {
			System.out.println("Error in class mediator : " + e.toString());
		}

		return true;
	}

	public String getUrlGetEntity() {
		return urlGetEntity;
	}

	public void setUrlGetEntity(String urlGetEntity) {
		this.urlGetEntity = urlGetEntity;
	}

	public String getUrlGetContext() {
		return urlGetContext;
	}

	public void setUrlGetContext(String urlGetContext) {
		this.urlGetContext = urlGetContext;
	}

}
