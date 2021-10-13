package opgave1;

import java.util.ArrayList;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hans");
        list.add("Viggo");
        list.add("Jens");
        list.add("Børge");
        list.add("Bent");

        System.out.println("Antal elementer: " + list.size());
        list.add(2,"Jane");
        System.out.println(list.get(2));


        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();




        for(String s : list){
            System.out.println(s);
        }
        list.remove(1);
        list.add(0,"Pia");
        list.add("Ib");
        System.out.println("Antal elementer: " + list.size());
        //list.remove(2);
        list.set(2, "Hansi");
        System.out.println("Antal elementer: " + list.size());
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("***************************");

        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i).length());
        }


        System.out.println("***************************");

        for(String s : list){
            System.out.println(s.length());
        }

        System.out.println("***************************");

    }
}
