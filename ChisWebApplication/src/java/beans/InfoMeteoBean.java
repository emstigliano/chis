package beans;
import it.esbforchis.www.wsEsbWeatherInformation.GetWeaterInformationInput;
import it.esbforchis.www.wsEsbWeatherInformation.GetWeaterInformationOutput;
import it.esbforchis.www.wsEsbWeatherInformation.Info;
import it.esbforchis.www.wsEsbWeatherInformation.WsEsbWeatherInformationProxy;
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
public class InfoMeteoBean implements Serializable {
    private String placeSelected;
    private Info[] info;
    private String errorCode;
    private String errorDescription;
    public Info[] getInfo() {
        return info;
    }
    public void setInfo(Info[] info) {
        this.info = info;
    }
    public void callWS() {
        try {
            String endpoint = "http://localhost:8280/services/wsEsbWeatherInformation";
            WsEsbWeatherInformationProxy proxy = new WsEsbWeatherInformationProxy(endpoint);
            GetWeaterInformationInput input = new GetWeaterInformationInput(Utility.replaceApostrophe(this.placeSelected));
            GetWeaterInformationOutput output = proxy.getWeatherInformation(input);
            setInfo(output.getInfo());
            setErrorCode(output.getErrorCode());
            setErrorDescription(output.getErrorDescription());
        } catch (RemoteException ex) {
            Logger.getLogger(InfoMeteoBean.class.getName()).log(Level.SEVERE, null, ex);
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
