package q07.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "q07RegisterController")
@RequestScoped
public class RegisterController {
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String password = "";
    private String passwordConfirm = "";



    public RegisterController() {
    }

    public void register() {
        FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Register successfully", null);
        FacesContext.getCurrentInstance().addMessage("registerMsg", javaTextMsg);
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
