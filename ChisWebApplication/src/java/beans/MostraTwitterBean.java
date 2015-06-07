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
public class MostraTwitterBean implements Serializable {

    private String placeSelected;
    private String[] twits;
    private String errorCode;
    private String errorDescription;

    public String[] getTwits() {
        return twits;
    }

    public void setTwits(String[] twits) {
        this.twits = twits;
    }

    public void callWS() {
        try {
            String endpoint = "http://esbforchis:8280/services/wsEsbSearchByPlace";
            WsEsbSearchByPlaceProxy wsEsbSearchByPlaceProxy = new WsEsbSearchByPlaceProxy(endpoint);
            GetTwitterResultInput getTwitterResultInput = new GetTwitterResultInput(Utility.replaceApostrophe(this.placeSelected));
            GetTwitterResultOutput getTwitterResultOutput = wsEsbSearchByPlaceProxy.getTwitterResult(getTwitterResultInput);
            setTwits(getTwitterResultOutput.getTwitterResult());
            setErrorCode(getTwitterResultOutput.getErrorCode());
            setErrorDescription(getTwitterResultOutput.getErrorDescription());
        } catch (RemoteException ex) {
            Logger.getLogger(MostraTwitterBean.class.getName()).log(Level.SEVERE, null, ex);
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
