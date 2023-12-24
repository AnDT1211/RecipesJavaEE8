package q06;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "q06NavigationController")
@RequestScoped
public class NavigationController {
    public String pageOne(){
        return "PAGE_1";
    }
    public String goBack() {
        return "index.xhtml";
    }
    public String pageTwo(){
        return "page2";
    }
//    public String nextPage(){
//        return "recipe03_06c";
//    }
}

