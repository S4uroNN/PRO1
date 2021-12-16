package opgave2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class opgave2 {
    public static void main(String[] args) {
        try {
            File filein = new File("C:/Users/Alin/Desktop/pro1ersjov.txt");
            //	File filein = new File("tal.txt");
            Scanner scan = new Scanner(filein);
            while (scan.hasNext()) {
                System.out.println(Integer.parseInt(scan.nextLine())*2);
            }
            scan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



}
