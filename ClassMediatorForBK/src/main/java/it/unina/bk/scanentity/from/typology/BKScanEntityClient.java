package it.unina.bk.scanentity.from.typology;

import it.unina.bk.common.Namespace;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

@SuppressWarnings({ "deprecation", "resource" })
public class BKScanEntityClient extends AbstractMediator {

	private String urlScanEntity;
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

			// Prepare json message for scanEntity
			JSONObject obj = new JSONObject();

			JSONArray arraySelectFamilies = new JSONArray();
			arraySelectFamilies.put("DC");

			JSONArray arraySelectColumns = new JSONArray();
			arraySelectColumns.put("DC,DC:TIPOLOGIA");

			JSONArray arrayFiltri = new JSONArray();
			JSONObject filtro = new JSONObject();
			filtro.put("fam", "DC");
			filtro.put("col", "DC:TIPOLOGIA");
			filtro.put("comp", "EQUAL");
			filtro.put("val", context.getEnvelope().getBody().getFirstElement()
					.getFirstElement().getText());

			arrayFiltri.put(filtro);

			obj.put("selectFamilies", arraySelectFamilies);
			obj.put("selectColumns", arraySelectColumns);
			obj.put("filtri", arrayFiltri);
			obj.put("operatore", "OR");
			String json2scanEntity = obj.toString();

			// Send POST request
			HttpClient clientScanEntity = new DefaultHttpClient();
			HttpPost post = new HttpPost(urlScanEntity);
			post.setHeader("User-Agent", USER_AGENT);
			StringEntity params = new StringEntity(json2scanEntity, "UTF-8");
			params.setContentType("application/json; charset=UTF-8");
			post.setEntity(params);
			System.out
					.println("Sending POST request to URL : " + urlScanEntity);
			System.out.println("Post message : " + json2scanEntity);
			HttpResponse responseGetEntity = clientScanEntity.execute(post);
			System.out.println("Response Code : "
					+ responseGetEntity.getStatusLine().getStatusCode());

			BufferedReader rdGetEntity = new BufferedReader(
					new InputStreamReader(responseGetEntity.getEntity()
							.getContent()));

			StringBuffer resultScanEntity = new StringBuffer();
			line = "";
			resultScanEntity.append("{\"scanEntityResponse\":");
			while ((line = rdGetEntity.readLine()) != null) {
				resultScanEntity.append(line);
			}
			resultScanEntity.append("}");

			// Convert JSON response into XML response
			System.out.println("Response message : "
					+ resultScanEntity.toString());
			JSONObject json = new JSONObject(resultScanEntity.toString());
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

	public String getUrlScanEntity() {
		return urlScanEntity;
	}

	public void setUrlScanEntity(String urlScanEntity) {
		this.urlScanEntity = urlScanEntity;
	}

	public String getUrlGetContext() {
		return urlGetContext;
	}

	public void setUrlGetContext(String urlGetContext) {
		this.urlGetContext = urlGetContext;
	}

}
