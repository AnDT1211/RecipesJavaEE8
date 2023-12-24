package main.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class MainWebController {
    public String toPage1() {
        return "/q01/index";
    }
    public String toPage2() {
        return "/q02/index";
    }
    public String toPage3() {
        return "/q03/index";
    }
    public String toPage4() {
        return "/q04/index";
    }
    public String toPage6() {
        return "/q06/index";
    }
    public String toPage7() {
        return "/q07/index";
    }
    public String toPage8() {
        return "/q08/index";
    }
    public String toPage9() {
        return "/q09/index";
    }
    public String toPage10() {
        return "/q10/index";
    }
    public String toPage18() {
        return "/q18/index";
    }

}
