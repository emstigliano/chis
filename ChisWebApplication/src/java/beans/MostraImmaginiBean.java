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
public class MostraImmaginiBean implements Serializable {
    private String placeSelected;
    private Image[] images;
    private ArrayList<Image> imagesList;
    private String errorCode;
    private String errorDescription;
    public ArrayList<Image> getImagesList() {
        return imagesList;
    }
    public void setImagesList(ArrayList<Image> imagesList) {
        this.imagesList = imagesList;
    }
    public void callWS() {
        try {
            String endpoint = "http://localhost:8280/services/wsEsbSearchByPlace";
            WsEsbSearchByPlaceProxy wsEsbSearchByPlaceProxy = new WsEsbSearchByPlaceProxy(endpoint);
            GetImagesInput getImagesInput = new GetImagesInput(Utility.replaceApostrophe(this.placeSelected));
            GetImagesOutput getImagesOutput = wsEsbSearchByPlaceProxy.getImages(getImagesInput);
            setImages(getImagesOutput.getImage());
            ArrayList<Image> arrayList = new ArrayList<>(Arrays.asList(getImagesOutput.getImage()));
            setImagesList(arrayList);
            setErrorCode(getImagesOutput.getErrorCode());
            setErrorDescription(getImagesOutput.getErrorDescription());
        } catch (RemoteException ex) {
            Logger.getLogger(MostraImmaginiBean.class.getName()).log(Level.SEVERE, null, ex);
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
    public Image[] getImages() {
        return images;
    }
    public void setImages(Image[] images) {
        this.images = images;
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
