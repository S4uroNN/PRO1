package kopimaskine;

import java.util.Scanner;
public class kopimaskine {
    Scanner input = new Scanner(System.in);
    private String tray = input.nextLine();
    private int paper = 1;

    public kopimaskine(String tray) {

    }
    public void paperInput(){
        System.out.println("How much paper do you want to add:");
        paper = paper + input.nextInt();
        System.out.println("Paper avaiable "+ paper);

    }

    public void copy() {
        System.out.println(tray);
        paper = paper - 1;
        System.out.println("Paper left: " + paper);

    }

    public boolean ranOut() {
        if (paper == 0){
        }
            return true;
    }



}
