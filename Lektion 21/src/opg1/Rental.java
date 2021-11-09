package opg1;

import java.util.ArrayList;

public class Rental {
    private int number;
    private int days;
    private String date;
    private final ArrayList<Car> cars = new ArrayList<>();

    public Rental(int number, String date, int days) {
        this.number = number;
        this.date = date;
        this.days = days;

    }

    public void addCar(Car car) {
        if(!cars.contains(car)){
            cars.add(car);
            car.addRental(this);
        }
    }
    public int getNumber(){
        return number;
    }


    public ArrayList<Car> getCars() {
        System.out.println("Car in rental");
        return new ArrayList<Car>(cars);
    }
    public void removeCar(Car car){
        if(cars.contains(car)){
            cars.remove(car);
            car.removeRental(this);
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
