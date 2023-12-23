package q04.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "q04WebController")
@RequestScoped
public class WebController {
    private String userName = "";
    private String userAge = "";
    private String userEmail = "";

    public WebController() {
        System.out.println("init");
//        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "bean bean", null);
//        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }

    public void register() {
        if (!userEmail.contains("@")) {
            FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "invalid email", null);
            FacesContext.getCurrentInstance().addMessage("componentForm:email", javaTextMsg);
        } else {
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "welcome", null);
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
