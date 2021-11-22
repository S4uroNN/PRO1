package opg2;

import jdk.swing.interop.SwingInterOpUtils;

public class GiftApp {
    public static void main(String[] args) {
        Person p1 = new Person("Jens",35);
        Person p2 = new Person("Jakob" , 34);
        Gift g1 = new Gift("Somehting",p1);
        Gift g2 = new Gift("Smething harder",p2);

        g1.setPrice(500);
        g2.setPrice(1000);

        p1.recieveGift(g2);
        p2.removeGift(g1);

        System.out.println(p1.getGiftPrice());
        System.out.println(p1.getSenderName());

    }
}
