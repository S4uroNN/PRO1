package minihandel;

import opgave1.Person;

public class PercentDiscount extends Discount {
    private int percentage;


    public PercentDiscount(int percentage) {
        super();
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
    @Override
    public double getDiscount(double price){
        return price * (percentage / 100.0);
    }
}
