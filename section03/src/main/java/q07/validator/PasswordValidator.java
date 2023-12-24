package q07.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


public class PasswordValidator {
    private static String pwd1;
    private static String pwd2;
    @FacesValidator("q07PwdValidFirst")
    public static class PwdValidFirst implements Validator<String> {

        @Override
        public void validate(FacesContext facesContext, UIComponent uiComponent, String pwd) throws ValidatorException {
            System.out.println(pwd);
            String out = "invalid password, should have a '@'";
            if(!(pwd.contains("@")) || pwd.isBlank())
                throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, out, null));
            else
                pwd1 = pwd;
        }
    }

    @FacesValidator("q07PwdValidSecond")
    public static class PwdValidSecond implements Validator<String> {

        @Override
        public void validate(FacesContext facesContext, UIComponent uiComponent, String pwd) throws ValidatorException {
            String out = "invalid password, should have a '@' and '#'";
            if(!(pwd.contains("#") && pwd.contains("@")) || pwd.isBlank())
                throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, out, null));
            else
                pwd2 = pwd;

            if(!pwd1.equals(pwd2))
                throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "does not match", null));
        }
    }
}
