package beans;
import it.esbforchis.www.wsEsbSearchByPlace.*;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@SessionScoped
public class MostraAltroBean implements Serializable {
    private String placeSelected;
    private Couple[] couples;
    private ArrayList<Couple> couplesList;
    private String errorCode;
    private String errorDescription;
    public Couple[] getCouples() {
        return couples;
    }
    public void setCouples(Couple[] couples) {
        this.couples = couples;
    }
    public ArrayList<Couple> getCouplesList() {
        return couplesList;
    }
    public void setCouplesList(ArrayList<Couple> couplesList) {
        this.couplesList = couplesList;
    }
    public void callWS() {
        try {
            String endpoint = "http://esbforchis:8280/services/wsEsbSearchByPlace";
            WsEsbSearchByPlaceProxy wsEsbSearchByPlaceProxy = new WsEsbSearchByPlaceProxy(endpoint);
            GetOtherInfoInput getOtherInfoInput = new GetOtherInfoInput(Utility.replaceApostrophe(this.placeSelected));
            GetOtherInfoOutput getOtherInfoOutput = wsEsbSearchByPlaceProxy.getOtherInfo(getOtherInfoInput);
            setCouples(getOtherInfoOutput.getCouple());
            ArrayList<Couple> arrayList = new ArrayList<>(Arrays.asList(getOtherInfoOutput.getCouple()));
            setCouplesList(arrayList);
            setErrorCode(getOtherInfoOutput.getErrorCode());
            setErrorDescription(getOtherInfoOutput.getErrorDescription());
        } catch (RemoteException ex) {
            Logger.getLogger(MostraAltroBean.class.getName()).log(Level.SEVERE, null, ex);
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
