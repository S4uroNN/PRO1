package minihandel;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alin", LocalDate.of(2000,10,11));
        Customer c2 = new Customer("Mathias", LocalDate.of(1986,4,7));

        Product p1 = new Product(1,"Fodbold",50);
        Product p2 = new Product(2,"CD-Drev",100);
        Product p3 = new Product(3,"Razer mus",480);
        Product p4 = new Product(4,"Razer keyboard",400);
        Product p5 = new Product(5,"Razer mikrofon",5000);

        Order o1 = new Order(1);
        Order o2 = new Order(2);
        Order o3 = new Order(3);
        Order o4 = new Order(4);
        Order o5 = new Order(5);
        Order o6 = new Order(6);

        o1.createOrderLine(1,p1);
        o1.createOrderLine(1,p2);
        o2.createOrderLine(2,p3);
        o2.createOrderLine(2,p4);

        c1.addOrder(o1);
        c1.addOrder(o2);

        o3.createOrderLine(1,p1);
        o3.createOrderLine(1,p2);
        o4.createOrderLine(1,p5);
        o4.createOrderLine(1,p4);
        o5.createOrderLine(1,p3);
        o5.createOrderLine(2,p2);
        o6.createOrderLine(1,p1);
        o6.createOrderLine(1,p2);

        c2.addOrder(o3);
        c2.addOrder(o4);
        c2.addOrder(o5);
        c2.addOrder(o6);

        System.out.println(c1.totalBuy());
        System.out.println(c2.totalBuy());

        Discount d1 = new PercentDiscount(15);
        Discount d2 = new FixedDiscount(200,5000);


        c1.addDiscount(d1);
        System.out.println(c1.totalBuy());
        System.out.println(c1.totalBuyWithDiscount());
        System.out.println();
        c2.addDiscount(d2);
        System.out.println(c2.totalBuy());
        System.out.println(c2.totalBuyWithDiscount());





    }
}
