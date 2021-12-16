package opgave3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class opgave3 {
    private static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        try {
            File filein = new File("C:/Users/Alin/Desktop/pro1ersjov.txt");
            //	File filein = new File("tal.txt");
            Scanner scan = new Scanner(filein);
            while (scan.hasNext()) {
                int number = scan.nextInt();
                numbers.add(number);
            }
            scan.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(numbers);
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

    }
}
