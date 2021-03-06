 
package beans;
import it.esbforchis.www.wsEsbSearchTools.*;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;
 
@ManagedBean
@SessionScoped
public class RicercaPerPosizioneBean implements Serializable {
    private String municipality;
    private String provice;
    private String region;
    private String[] place;
    private String placeSelected;
    private String errorCode;
    private String errorDescription;
    public String getMunicipality() {
        return municipality;
    }
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }
    public String getProvice() {
        return provice;
    }
    public void setProvice(String provice) {
        this.provice = provice;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void callWS() {
        try {
            String endpoint = "http://esbforchis:8280/services/wsEsbSearchTools";
            WsEsbSearchToolsProxy esbSearchToolsProxy = new WsEsbSearchToolsProxy(endpoint);
            SearchForPositionInput searchForPositionInput = new SearchForPositionInput(this.municipality, this.provice, this.region);
            SearchForPositionOutput searchForPositionOutput = esbSearchToolsProxy.searchForPosition(searchForPositionInput);
            String [] searchResult = searchForPositionOutput.getPlace();
            setPlace(Utility.replaceSingleQuote(searchResult));
            setErrorCode(searchForPositionOutput.getErrorCode());
            setErrorDescription(searchForPositionOutput.getErrorDescription());
        } catch (RemoteException ex) {
            Logger.getLogger(RicercaPerPosizioneBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String[] getPlace() {
        return place;
    }
    public void setPlace(String[] place) {
        this.place = place;
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
    public void setErrorDescription(String errprDescription) {
        this.errorDescription = errprDescription;
    }
    public String getPlaceSelected() {
        return placeSelected;
    }
    public void setPlaceSelected(String placeSelected) {
        this.placeSelected = placeSelected;
    }
    public String redirectToInfoMeteo(String placeSelected) {
        this.setPlaceSelected(placeSelected);
        return "infoMeteo.xhtml";
    }
    public String redirectToMostraDescrizione(String placeSelected) {
        this.setPlaceSelected(placeSelected);
        return "mostraDescrizione.xhtml";
    }
    public String redirectToMostraImmagini(String placeSelected) {
        this.setPlaceSelected(placeSelected);
        return "mostraImmagini.xhtml";
    }
    public String redirectToCercaSuTwitter(String placeSelected) {
        this.setPlaceSelected(placeSelected);
        return "mostraTwitter.xhtml";
    }
    public String redirectToAltro(String placeSelected) {
        this.setPlaceSelected(placeSelected);
        return "mostraAltro.xhtml";
    }
}
