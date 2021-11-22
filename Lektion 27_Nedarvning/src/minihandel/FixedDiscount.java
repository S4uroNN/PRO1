package minihandel;

public class FixedDiscount extends Discount{
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit){
        super();
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    @Override
    public double getDiscount(double price){
        double discountedprice = 0;
        if(price >= discountLimit){
            discountedprice = fixedDiscount;
        }
        return discountedprice;
    }

}
