package q18;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "q18WebController")
@SessionScoped
public class WebController {

    public void init() {
        System.out.println("init");
    }
}
