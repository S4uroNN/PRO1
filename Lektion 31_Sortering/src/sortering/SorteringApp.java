package sortering;

import model.Customer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SorteringApp {

    public static void main(String[] args) {
        final int[] tabelInit = { 34, 12, 56, 12, 45, 89, 2 };
        final String[] stringInit = {"Erna" , "Elly", "Laurits","Bertha","Christian","August","Marius","John","Tove","Poul","Torkild"};

        System.out.println("Bubbelsortering");
        int[] tabel = Arrays.copyOf(tabelInit, tabelInit.length);
        System.out.println(Arrays.toString(tabel));
        BubbelSortering.bubbleSort(tabel);
        System.out.println(Arrays.toString(tabel));
        System.out.println();

        System.out.println("Bubblesortering String");
        String[] tabelS = Arrays.copyOf(stringInit,stringInit.length);
        System.out.println(Arrays.toString(tabelS));
        BubbelSortering.bubbleSortString(tabelS);
        System.out.println(Arrays.toString(tabelS));
        System.out.println();

        System.out.println("--------------------------------");

        System.out.println("Insertionsortering");
        tabel = Arrays.copyOf(tabelInit, tabelInit.length);
        System.out.println(Arrays.toString(tabel));
        SelectionSort.selectionSort(tabel);
        System.out.println(Arrays.toString(tabel));
        System.out.println();

        tabelS = Arrays.copyOf(stringInit,stringInit.length);

        System.out.println(Arrays.toString(tabelS));
        SelectionSort.selectionSortString(tabelS);
        System.out.println(Arrays.toString(tabelS));

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nørskov","Mads",23));
        customers.add(new Customer("Bering","Mathias",35));
        customers.add(new Customer("Andrei","Alin",21));
        customers.add(new Customer("Røv","Torben",92));

        System.out.println(customers);
        SelectionSort.selectionSortString(customers);
        System.out.println(customers);

        System.out.println("--------------------------------");

        System.out.println("Selectionsortering");
        tabel = Arrays.copyOf(tabelInit, tabelInit.length);
        System.out.println(Arrays.toString(tabel));
        InsertionSortering.insertioneSort(tabel);
        System.out.println(Arrays.toString(tabel));




    }

}
