
 
 
 
 
package beans;
import it.esbforchis.www.wsEsbSearchByPlace.*;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
 
@ManagedBean
@SessionScoped
public class MostraDescrizioneBean implements Serializable {
    private String placeSelected;
    private String[] descriptions;
    private String errorCode;
    private String errorDescription;
    public String[] getDescriptions() {
        return descriptions;
    }
    public void setDescriptions(String[] descriptions) {
        this.descriptions = descriptions;
    }
    public void callWS() {
        try {
            String endpoint = "http://esbforchis:8280/services/wsEsbSearchByPlace";
            WsEsbSearchByPlaceProxy wsEsbSearchByPlaceProxy = new WsEsbSearchByPlaceProxy(endpoint);
            GetDescriptionsInput getDescriptionsInput = new GetDescriptionsInput(Utility.replaceApostrophe(this.placeSelected));
            GetDescriptionsOutput getDescriptionsOutput = wsEsbSearchByPlaceProxy.getDescriptions(getDescriptionsInput);
            setDescriptions(getDescriptionsOutput.getDescription());
            setErrorCode(getDescriptionsOutput.getErrorCode());
            setErrorDescription(getDescriptionsOutput.getErrorDescription());
        } catch (RemoteException ex) {
            Logger.getLogger(MostraDescrizioneBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getPlaceSelected() {
        return placeSelected;
    }
    public void setPlaceSelected() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
        this.placeSelected = params.get("placeSelected");
    }
    public String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    public String getErrorDescription() {
        return errorDescription;
    }
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
