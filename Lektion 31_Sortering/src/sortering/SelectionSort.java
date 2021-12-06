package sortering;

import model.Customer;

import java.util.ArrayList;

public class SelectionSort {
    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    private static void swap(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    private static void swap(ArrayList<Customer> list, int i, int j) {
        Customer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j,temp);
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minPos]) {
                    minPos = j;
                }

            }
            swap(list, i, minPos);
        }
    }

    public static void selectionSortString(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[minPos]) < 0) {
                    minPos = j;
                }

            }
            swap(list, i, minPos);
        }

    }
    public static void selectionSortString(ArrayList<Customer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minPos = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(minPos)) < 0) {
                    minPos = j;
                }
            }
            swap(list, i , minPos);
        }
    }

}
