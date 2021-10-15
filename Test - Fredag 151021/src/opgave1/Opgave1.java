package opgave1;

import java.util.ArrayList;

public class Opgave1 {
    public static void main(String[] args) {
        int wordsOfFive = 0;
        ArrayList<String> list;
        list = new ArrayList<>();


        list.add("Pax"); // add tilføjer bagest i listen
        list.add("Fido");
        list.add("Molly");
        list.add("Pluto");
        list.add("Juno");

        System.out.println(list);
        list.set(2, "King");
        list.remove(1);
        System.out.println(list);
        list.add(3,"Trine");
        System.out.println(list);
        System.out.println("Størelsen af array: " + list.size());

        for(String s : list){
            if(s.length() == 5){
                wordsOfFive++;
            }
        }
        System.out.println("Ord med 5 bogstaver: " + wordsOfFive);
        System.out.println();
        for(int i = list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
        System.out.println();
        for(int i = 0;i<list.size();i++){
            if(i % 2 == 0){
                System.out.println(list.get(i));
            }
        }

    }

}
