package opgaver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KundeApp {
    public static void main(String[] args) {

        Customer c1 = new Customer("Jensen", "Mikkel", 30);
        Customer c2 = new Customer("Hansen", "Mikkel", 25);
        Customer c3 = new Customer("Ali", "Omar", 10);
        Customer c4 = new Customer("Zinchenko", "Victor", 36);

        Customer c5 = new Customer("Kilobyte", "Size ", 44);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nørskov", "Mads", 23));
        customers.add(new Customer("Bering", "Mathias", 35));
        customers.add(new Customer("Andrei", "Alin", 21));
        customers.add(new Customer("Røv", "Torben", 92));

        System.out.println(customers);
        Collections.sort(customers);
        indsætKunde(customers, c1);
        System.out.println(customers);

        Customer[] customers1 = new Customer[7];
        customers1[0] = c1;
        customers1[1] = c2;
        customers1[2] = c3;
        customers1[3] = c4;

        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(customers1));
        bubbleSortString(customers1);
        indsætKunde(customers1, c5);
        System.out.println(Arrays.toString(customers1));
        System.out.println();

        System.out.println(numberOfCnharsInARow("Jubiiiii", 5));
        System.out.println(numberOfCnharsInARow("Jubiiiii", 6));



    }

    //Opgave 1
    public static void indsætKunde(ArrayList<Customer> customers, Customer customer) {
        int index = -1;
        int i = 0;
        while (index == -1 && i < customers.size()) {
            if (customers.get(i).compareTo(customer) > 0) {
                customers.add(i, customer);
                index = i;
            } else {
                i++;
            }
        }
    }


    //Opgave 2
    public static void indsætKunde(Customer[] customers, Customer customer) {
        int j = customers.length - 1;
        while (j >= 0 && customers[j] == null) {
            j--;
        }
        j++;
        boolean found = false;
        while (!found && j > 0) {
            if (customer.compareTo(customers[j - 1]) > 0) {
                found = true;
            } else {
                customers[j] = customers[j - 1];
                j--;
            }
        }
        customers[j] = customer;
    }

    private static void swap(Customer[] list, int i, int j) {
        Customer temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void bubbleSortString(Customer[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (list[i] != null) {
                    if (list[j].compareTo(list[j + 1]) > 0) {
                        swap(list, j, j + 1);

                    }
                }

            }
        }
    }

    //Opgave3

    public static boolean numberOfCnharsInARow(String s, int k) {
        boolean found = false;
        int i = 0;
        while (!found && i < s.length() - (k - 1)) {
            if (match(s, i, k)) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }

    private static boolean match(String sm, int m, int i) {
        boolean foundDiff = false;
        int j = 0;
        while (!foundDiff && j < i) {
            if (sm.charAt(i) != sm.charAt(m + j)) {
                foundDiff = true;
            } else {
                j++;
            }
        }
        return !foundDiff;
    }
}
