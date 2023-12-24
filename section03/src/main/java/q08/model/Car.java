package q08.model;

public class Car {
    private String name = "";
    private String series = "";
    private String year = "";
    private String plateNumber = "";

    public Car() {
    }

    public Car(String name, String series, String year, String plateNumber) {
        this.name = name;
        this.series = series;
        this.year = year;
        this.plateNumber = plateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
