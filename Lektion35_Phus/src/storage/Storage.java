package storage;

import model.Bil;
import model.Parkeringhus;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Parkeringhus> parkeringhuse =  new ArrayList<>();
    private static final ArrayList<Bil> biler = new ArrayList<Bil>();


    //Parkeringshuse
    public static ArrayList<Parkeringhus> getParkeringhuse(){
        return new ArrayList<>(parkeringhuse);
    }

    public static void addParkeringshuse(Parkeringhus parkeringhus){
        parkeringhuse.add(parkeringhus);
    }

    public static void removeParkeringshuse(Parkeringhus parkeringhus){
        parkeringhuse.remove(parkeringhus);
    }
    //Biler
    public static ArrayList<Bil> getBiler(){
        return new ArrayList<>(biler);
    }
    public static void addBiler(Bil bil){
        biler.add(bil);
    }
    public static void removeBil(Bil bil){
        biler.remove(bil);
    }

}
