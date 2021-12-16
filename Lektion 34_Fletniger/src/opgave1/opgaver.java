package opgave1;

import javax.print.attribute.standard.PrinterURI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class opgaver {
    public static ArrayList fletAlleKunder(ArrayList<Customer> l1, ArrayList<Customer> l2) {
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0) {
                result.add(l1.get(i1));
                i1++;
            } else {
                result.add(l2.get(i2));
                i2++;
            }
        }
        while (i1 < l1.size()) {
            result.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.size()) {
            result.add(l2.get(i2));
            i2++;
        }
        return result;
    }

    public static int[] fællesTal(int[] l1, int[] l2) {
        int[] tempResult = new int[10];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l1.length && j < l2.length) {
            if (l1[i] < l2[j]) {
                i++;
            } else if (l1[i] > l2[j]) {
                j++;
            } else {
                tempResult[k] = l1[i];
                k++;
                i++;
                j++;
            }
        }
        int[] result = new int[k];
        System.arraycopy(tempResult, 0, result, 0, result.length);
        return result;
    }

    public static ArrayList goodCustomers(ArrayList<Customer> l1, Customer[] l2) {
        ArrayList<Customer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < l1.size() && j < l2.length) {
            if (l1.get(i).compareTo(l2[j]) != 0) {
                result.add(l1.get(i));
                i++;
            } else {
                i++;
                j++;
            }
        }
        while (i < l1.size()) {
            result.add(l1.get(i));
            i++;
        }

        return result;
    }

    public static boolean linFileSearch(String filename, int target) throws FileNotFoundException {
        boolean found = false;
        File filein = new File(filename);
        Scanner scan = new Scanner(filein);
        while (!found && scan.hasNext()) {
            int k = scan.nextInt();
            if (k == target) {
                found = true;
            }
        }
        return found;
    }

    public static void mergeFiles(String filename, String filename2, String fileNameNy) throws FileNotFoundException {
        File filein = new File(filename);
        File filein2 = new File(filename2);
        File filein3 = new File(fileNameNy);

        Scanner scan1 = new Scanner(filein);
        Scanner scan2 = new Scanner(filein2);
        PrintWriter printer = new PrintWriter(filein3);

        ArrayList<Integer> file = new ArrayList<>();
        ArrayList<Integer> file2 = new ArrayList<>();
        ArrayList<Integer> file3 = new ArrayList<>();
        int a = 0;
        while (scan1.hasNext()) {
            a = scan1.nextInt();
            file.add(a);
            file3.add(a);
        }
        int b = 0;
        while (scan2.hasNext()) {
            b = scan2.nextInt();
            file2.add(b);
            file3.add(b);
        }
        Collections.sort(file3);
        for (int k = 0; k < file3.size(); k++) {
            int tal = file3.get(k);
            printer.println(tal);
        }
        printer.flush();
        printer.close();
        System.out.println("done");

    }

    public static void findfællesTal(String fileName1, String fileName2, String fileNameNy) throws IOException, FileNotFoundException {
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        Scanner scan1 = new Scanner(file1);
        Scanner scan2 = new Scanner(file2);
        PrintWriter write = new PrintWriter(fileNameNy);
        int i = scan1.nextInt();
        int j = scan2.nextInt();
        while (i < Integer.MAX_VALUE && j < Integer.MAX_VALUE) {
            if (i == j) {
                write.println(i);
                write.println(j);
                i = scan1.nextInt();
            } else if (i < j) {
                i = scan1.nextInt();
            } else {
                j = scan2.nextInt();
            }
        }
        scan1.close();
        scan2.close();
        write.flush();
        write.close();
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Customer> l1 = new ArrayList<>();
        ArrayList<Customer> l2 = new ArrayList<>();
        ArrayList<Customer> l3 = new ArrayList<>();

        l1.add(new Customer("Olesen", "Karl", 23));
        l1.add(new Customer("Jensen", "Ulla", 42));
        l1.add(new Customer("Mortensen", "Jens", 64));
        l1.add(new Customer("Karlsen", "Ole", 43));
        l1.add(new Customer("Nørskov", "Mads", 23));
        l2.add(new Customer("Røv", "Torben", 34));
        l2.add(new Customer("Hvam", "Frank", 36));
        l2.add(new Customer("And", "Anders", 21));

        l3.add(new Customer("Olesen", "Karl", 23));
        l3.add(new Customer("Jensen", "Ulla", 42));
        l3.add(new Customer("Mortensen", "Jens", 64));
        l3.add(new Customer("Karlsen", "Ole", 43));
        l3.add(new Customer("Nørskov", "Mads", 23));
        l3.add(new Customer("Røv", "Torben", 34));
        l3.add(new Customer("Hvam", "Frank", 36));
        l3.add(new Customer("And", "Anders", 21));
        l3.add(new Customer("Tschenka", "Emil", 21));
        l3.add(new Customer("Hankil", "Rikke", 24));

        Customer c1 = new Customer("Olesen", "Karl", 23);
        Customer c2 = new Customer("Jensen", "Ulla", 42);
        Customer c3 = new Customer("Mortensen", "Jens", 64);
        Customer c4 = new Customer("Hvam", "Frank", 36);

        Customer[] customers = {c1, c2, c3, c4};
        bubbleSortString(customers);
        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);

        System.out.println(l3);
        System.out.println(l2);
        System.out.println();
        System.out.println(fletAlleKunder(l3, l2));
        System.out.println();

        int[] integers = {2, 4, 6, 8, 10, 12, 14};
        int[] integers2 = {1, 2, 4, 5, 6, 9, 12, 17};

        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(integers2));
        System.out.println(Arrays.toString(fællesTal(integers, integers2)));
        System.out.println();

        System.out.println("ArrayList" + l3);
        System.out.println("Array" + Arrays.toString(customers));
        System.out.println(goodCustomers(l3, customers));
        System.out.println();

//        System.out.println(linFileSearch("D:/Users/OneDrive/IdeaProjects/PRO1/scratch.txt", 218));
        System.out.println();

//        mergeFiles("D:/Users/OneDrive/IdeaProjects/PRO1/scratch.txt", "D:/Users/OneDrive/IdeaProjects/PRO1/scratch1.txt", "D:/Users/OneDrive/IdeaProjects/PRO1/scratch2.txt");
        findfællesTal("C:\\Users\\Alin\\OneDrive\\IdeaProjects\\PRO1\\scratch.txt","C:\\Users\\Alin\\OneDrive\\IdeaProjects\\PRO1\\scratch1.txt","C:\\Users\\Alin\\OneDrive\\IdeaProjects\\PRO1\\scratch4.txt");
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
}
