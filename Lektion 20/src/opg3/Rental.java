package opg3;

import java.util.ArrayList;
import java.util.Arrays;

public class Rental {
    private int number;
    private int days;
    private String date;
    private Car car;
    private ArrayList<Car> cars = new ArrayList<>();

    public Rental(int number, String date, int days) {
        this.number = number;
        this.date = date;
        this.days = days;

    }

    public void addCar(Car car) {
        if(!cars.contains(car)){
            cars.add(car);
        }
    }


    public ArrayList<Car> getCars() {
        System.out.println("Car in rental");
        return new ArrayList<Car>(cars);
    }
    public void removeCar(Car car){
        if(cars.contains(car)){
            cars.remove(car);
        }
    }

    public double getPrice() {
        double price = 0;
        for(Car s : cars){
            price += s.getPricePerDay();
        }
        price = price * days;
        return price;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
