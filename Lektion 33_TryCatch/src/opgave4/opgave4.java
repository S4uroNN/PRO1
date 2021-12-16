package opgave4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class opgave4 {
    public static void main(String[] args) {
        try{
            String filename = "C:/Users/Alin/Desktop/100taluligemindreend.txt";
            PrintWriter printWriter = new PrintWriter(filename);

            int number = 100;
            for(int i = 0;i<100;i++){
                if(i%2 != 0){
                    printWriter.println(i);
                }
            }

            printWriter.flush();
            printWriter.close();

            System.out.println("Filen er lavet");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
