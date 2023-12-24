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
}
