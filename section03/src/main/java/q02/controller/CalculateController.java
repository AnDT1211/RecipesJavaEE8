package q02.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Random;
import java.util.ResourceBundle;

@ManagedBean(name = "q02CalculateController")
@SessionScoped
public class CalculateController {
    private int num1;
    private int num2;
    private int result;
    private String label1;
    private String label2;
    private String buttonPlusAnswer;
    private String solutionLabel;

    public CalculateController() {
        System.out.println("init");
        ResourceBundle rb = ResourceBundle.getBundle("app/q02");
        label1 = rb.getString("label1");
        label2 = rb.getString("label2");
        buttonPlusAnswer = rb.getString("buttonPlusAnswer");
        solutionLabel = rb.getString("solutionLabel");
    }
    public void calculate() {
        System.out.println("calculate function");
        result = num1 + num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public String getButtonPlusAnswer() {
        return buttonPlusAnswer;
    }

    public void setButtonPlusAnswer(String buttonPlusAnswer) {
        this.buttonPlusAnswer = buttonPlusAnswer;
    }

    public String getSolutionLabel() {
        return solutionLabel;
    }

    public void setSolutionLabel(String solutionLabel) {
        this.solutionLabel = solutionLabel;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
