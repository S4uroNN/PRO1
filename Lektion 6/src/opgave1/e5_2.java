package opgave1;

import java.util.Scanner;

public class e5_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter Number with decimals:");
        double tal2 = read.nextDouble();

        if (tal2 == 0){
            System.out.println("Number is zero");
        }else if (tal2 < 0){
            System.out.println("number is negative");
        }else if (tal2 > 0){
            System.out.println("number is positive");
        }
        if (tal2 <= 1 ){
            System.out.println("Number is small");
        }else if(tal2 >=10000){
            System.out.println("Number is large");
        }
    }

}
