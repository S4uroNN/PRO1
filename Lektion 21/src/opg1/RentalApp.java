package opg1;

public class RentalApp {
    public static void main(String[] args) {
        Car car = new Car("CK 78 241", 2019);
        Car car2 = new Car("CY 44 019", 2018);
        Car car3 = new Car("BC 72 792", 2016);
        Car car4 = new Car("BT 59 039", 2018);
        Car car5 = new Car("BZ 79 973", 2011);

        car.setDayPrice(250);
        car2.setDayPrice(500);
        car3.setDayPrice(1000);
        car4.setDayPrice(2000);
        car5.setDayPrice(4000);


        Rental rental1 = new Rental(1, "03112021", 69);
        Rental rental2 = new Rental(2, "03112021", 70);

        rental1.addCar(car);
        car.addRental(rental1);
        rental1.addCar(car2);
        car2.addRental(rental1);
        rental1.addCar(car3);
        car3.addRental(rental1);
        rental1.addCar(car4);
        car4.addRental(rental1);
        rental1.addCar(car5);

        rental2.addCar(car3);
        car3.addRental(rental2);

        System.out.println(rental1.getDays());
        System.out.println("pris for udlån: " + rental1.getPrice());

        System.out.println("Longest rental " + car3.longestRental());
    }

}
