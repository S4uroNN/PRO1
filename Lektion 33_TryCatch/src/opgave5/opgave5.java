package opgave5;

import java.awt.font.NumericShaper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class opgave5 {
    public static void main(String[] args) {
        try {
            String filename = "C:/Users/Alin/Desktop/indlæstalfratast.txt";
            PrintWriter printWriter = new PrintWriter(filename);

            Scanner scan = new Scanner(System.in);
            boolean end = false;
            while(!end){
                int number = scan.nextInt();
                if(number == -1){
                    end = true;
                    System.out.println("ITS DONE");
                }else{
                    printWriter.println(number);
                }
            }
            printWriter.flush();
            printWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException m) {
            System.out.println("Eow! Tal ikk bogstaver! ");
        }
    }
}
