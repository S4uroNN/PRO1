package model;

import java.util.ArrayList;

public class MethodsArrayList {
    
    /**
     *
     * @param list
     * @return sums the mumbers in the list using a for loop
     */
    public int sumListe(ArrayList<Integer> list) {
        int resultat = 0;
        for (int i = 0; i < list.size(); i++) {
        	int tal = list.get(i);
            resultat = resultat + list.get(i);
        }
        return resultat;
    }
    
    /**
    *
    * @param list
    * @return sums the mumbers in the list using a forEach loop
    */
    public int sumListe2(ArrayList<Integer> list) {
        int resultat = 0;
        for (int tal : list) {
            resultat = resultat + tal;
        }
        return resultat;
    }
    
    /**
     *
     * @param list
     * @return index at the first even number
     */
    public int hasEvenAtIndex(ArrayList<Integer> list) {
        int index = -1;
        int i = 0;
        while (index == -1 && i < list.size()) {
            if (list.get(i) % 2 == 0) {
                index = i;
            }
            i++;
        }
        return index;
        
    }

    public int minNumber(ArrayList<Integer> list){
        int smallNumber = 10000;
        for(int i = 0; i<list.toArray().length;i++){
            if(list.get(i) < smallNumber){
                smallNumber=list.get(i);
            }
        }
        return smallNumber;
    }

    public double average(ArrayList<Integer> list){
        int sum = 0;
        double average = 0.0;
        for(int i = 0;i<list.size();i++){
            sum = sum + list.get(i);


            if(list.size()> 0){
                average = (double)sum /list.size();
            }
        }
        return average;
    }
    public int countZeros(ArrayList<Integer> list){
        int zeros = 0;
        for(int zero : list){
            if(zero == 0){
                zeros++;
            }
        }
        return zeros;
    }
    public void swapEvenWithZero(ArrayList<Integer> list){
        for(int i = 0;i< list.size();i++){
            if(list.get(i) % 2 == 0){
                list.set(i,0);

            }
        }
    }
    public ArrayList<Integer> aEvenList(ArrayList<Integer> list){
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for(int i = 0;i<list.size();i++){
            if(list.get(i) % 2 == 0){
                evenList.add(list.get(i));
            }

        }
        return evenList;
    }

}
