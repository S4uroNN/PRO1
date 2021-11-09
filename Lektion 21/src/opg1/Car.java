package opg1;

import java.util.ArrayList;

public class Car {
    private String license;
    private int year;
    private double pricePerDay;
    private ArrayList<Rental> rentals = new ArrayList<>();

    public Car(String license, int year) {
        this.license = license;
        this.year = year;

    }
    public void addRental(Rental rental){
        if(!rentals.contains(rental)){
            rentals.add(rental);
            rental.addCar(this);
        }
    }

    public void removeRental(Rental rental){
        if(rentals.contains(rental)){
            rentals.remove(rental);
            rental.removeCar(this);
        }
    }
    public ArrayList<Rental> getRentals(){
        return new ArrayList<>(rentals);
    }

    public int longestRental(){
        int days = 0;
        for(int i = 0; i<rentals.size();i++){
            if (rentals.get(i).getDays()>days);
            days = rentals.get(i).getDays();
            }

        return days;
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
