package opgave1;

import java.util.Scanner;

public class e5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int tal1 = scan.nextInt();

        if (tal1 < 0){
            System.out.println("Number is negative");
            }else if(tal1 == 0){
            System.out.println("Number is zero");
            }else if(tal1 > 0){
            System.out.println("Number is positive");
        }
        scan.close();
    }
}
