
 
 
 
 
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
public class RicercaPerTipologiaBean implements Serializable {

    private String typology;

    private String[] place;
    private String placeSelected;
    private String errorCode;
    private String errorDescription;

    public void callWS() {
        try {
            String endpoint = "http://localhost:8280/services/wsEsbSearchTools";
            WsEsbSearchToolsProxy esbSearchToolsProxy = new WsEsbSearchToolsProxy(endpoint);
            SearchForTypologyInput searchForTypologyInput = new SearchForTypologyInput(this.typology);
            SearchForTypologyOutput searchForTypologyOutput = esbSearchToolsProxy.searchForTypology(searchForTypologyInput);
            String [] searchResult = searchForTypologyOutput.getPlace();
            setPlace(Utility.replaceSingleQuote(searchResult));
            setErrorCode(searchForTypologyOutput.getErrorCode());
            setErrorDescription(searchForTypologyOutput.getErrorDescription());
        } catch (RemoteException ex) {
            Logger.getLogger(RicercaPerTipologiaBean.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getTypology() {
        return typology;
    }

    public void setTypology(String typology) {
        this.typology = typology;
    }

}
