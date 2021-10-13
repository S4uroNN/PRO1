package opgave1;


import java.util.Scanner;

public class e5_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double n1 = scan.nextInt();
        System.out.println("Enter second number: ");
        double n2 = scan.nextInt();
        System.out.println("Enter third number: ");
        double n3 = scan.nextInt();
        scan.close();

        if (n1 > n2 && n2 > n3) {
            System.out.println("Decreasing");
        } else if (n1 < n2 && n2 < n3) {
            System.out.println("Increasing");
        } else
            System.out.println("Neither");
        }

    }

