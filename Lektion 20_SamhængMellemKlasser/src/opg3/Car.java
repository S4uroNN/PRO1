package opg3;

public class Car {
    private String license;
    private int year;
    private double pricePerDay;

    public Car(String license, int year) {
        this.license = license;
        this.year = year;

    }

    public void setDayPrice(double price) {
        this.pricePerDay = price;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getLicense() {
        return license;
    }

    public int getYear() {
        return year;
    }
}
