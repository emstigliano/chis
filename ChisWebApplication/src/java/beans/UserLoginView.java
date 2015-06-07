 
package beans;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
@ManagedBean
public class UserLoginView {
    private Boolean logged;
    
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getLogged() {
        return logged;
    }
    public void setLogged(Boolean logged) {
        this.logged = logged;
    }
    public String login(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
        if (username != null && username.equals("admin") && password != null && password.equals("emanuele")) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Benvenuto", username.toUpperCase());
        } else if (username != null && username.equals("vmoscato") && password != null && password.equals("vmoscato")) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Benvenuto", username.toUpperCase());
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Errore durante l'accesso", "Credenziali non valide");
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
        this.logged = loggedIn;
        if (loggedIn == true) {
            return "ricerca.xhtml";
        } else {
            return "index.xhtml";
        }
    }
}
