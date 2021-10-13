package Opgave2;

public class program {
    public static void main(String[] args) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";

        System.out.println(ord1.toUpperCase());
        System.out.println(ord2.toLowerCase());
        System.out.println(ord1 + " " + ord2);

        String ord3 = ord1 + " " + ord2.toLowerCase();
        System.out.println(ord3);
        System.out.println(ord3.length());

        String ord4 = ord1.substring(0,7);
        System.out.println(ord4);
        String ord5 = ord2.substring(2,7);
        System.out.println(ord5);

        String ord6 = ord1.substring(7,11);
        System.out.println(ord6);

        }
    }


