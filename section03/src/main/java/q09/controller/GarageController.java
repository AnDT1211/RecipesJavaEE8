package q09.controller;

import q09.model.Car;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "q09GarageController")
@SessionScoped
public class GarageController {
    private List<Car> cars;

    private String carNameReg = "";
    private String carSeriesReg = "";
    private String carYearReg = "";
    private String carNumReg = "";


    public void register() {
        cars.add(new Car(carNameReg, carSeriesReg, carYearReg, carNumReg));
        carNameReg = "";
        carSeriesReg = "";
        carYearReg = "";
        carNumReg = "";
    }

    public void checkingCar(String name, String num) {
        // we can navigate to different page here
        System.out.println(name + " -> " + num);
    }
    public GarageController() {
        cars = new ArrayList<>(List.of(
                new Car("a1", "a2", "2000", "123"),
                new Car("a1", "a2", "2001", "123"),
                new Car("a1", "a2", "2002", "123"),
                new Car("a1", "a2", "2003", "123")
        ));
    }

    public String getCarNameReg() {
        return carNameReg;
    }

    public void setCarNameReg(String carNameReg) {
        this.carNameReg = carNameReg;
    }

    public String getCarSeriesReg() {
        return carSeriesReg;
    }

    public void setCarSeriesReg(String carSeriesReg) {
        this.carSeriesReg = carSeriesReg;
    }

    public String getCarYearReg() {
        return carYearReg;
    }

    public void setCarYearReg(String carYearReg) {
        this.carYearReg = carYearReg;
    }

    public String getCarNumReg() {
        return carNumReg;
    }

    public void setCarNumReg(String carNumReg) {
        this.carNumReg = carNumReg;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
