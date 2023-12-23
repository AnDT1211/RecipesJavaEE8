package q01.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class WebControllerAnno {
    private int age = 12;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
