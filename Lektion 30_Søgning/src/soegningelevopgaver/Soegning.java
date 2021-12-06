package soegningelevopgaver;

import java.util.ArrayList;

public class Soegning {
    //Opgave 1
    public boolean findUlige(int[] tabel) {
        boolean ulige = false;
        int i = 0;
        while (!ulige && i < tabel.length) {
            int k = tabel[i];
            if (k % 2 != 0) {
                ulige = true;
            } else {
                i++;
            }
        }

        return ulige;
    }

    //Opgave 2
    public int findTal(int[] tabel) {
        int index = -1;
        int i = 0;
        while (index == -1 && i < tabel.length) {
            int k = tabel[i];
            if (k >= 10 && k <= 15) {
                index = tabel[i];
            } else {
                i++;
            }
        }
        return index;
    }

    //opgave 3

    public boolean equalNumbers(int[] tabel) {
        boolean found = false;
        int i = 1;
        while (!found && i < tabel.length) {
            int k = tabel[i];
            int last = tabel[i - 1];
            if (k == last) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }

    public int findAndReplace(ArrayList<Integer> list, int n) {
        int index = -1;
        int i = 0;
        while (index == -1 && i < list.size()) {
            int k = list.get(i);

            if (k == n) {
                if (i != 0) {
                    int before = list.get(i - 1);
                    index = k;
                    list.set(i - 1, k);
                    list.set(i, before);
                }
            } else {
                i++;
            }
        }
        return index;
    }

    public int squareRootBinary(int number) {
        int left = 0;
        int right = number;
        int root = -1;
        while (root == -1) {
            int middle = (left + right) / 2;
            if (middle * middle > number) {
                root = middle - 2;
            }
        }
        return root;
    }
    // her skriver du metoder til opgaverne 2,3,5,6 og 7
}
