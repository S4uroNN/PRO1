package model;

import java.util.ArrayList;
import java.util.Arrays;

public class KundeApp {
    public static void main(String[] args) {

        Customer c1 = new Customer("Jensen" , "Mikkel", 30);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nørskov","Mads",23));
        customers.add(new Customer("Bering","Mathias",35));
        customers.add(new Customer("Andrei","Alin",21));
        customers.add(new Customer("Røv","Torben",92));

        System.out.println(customers);
        indsætKunde(customers,c1);
        System.out.println(customers);


    }
    public static void indsætKunde(ArrayList<Customer> kunder , Customer customer){
        int index = -1;
        int i = 0;
        while(index == -1 && i<kunder.size()){
            if(customer.compareTo(kunder.get(i))> 0){
                kunder.add(i,customer);
                index = i;
            }else{
                i++;
            }
        }
    }
}
