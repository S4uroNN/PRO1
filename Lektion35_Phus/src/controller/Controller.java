package controller;

import model.Bil;
import model.Bilmærke;
import model.Parkeringhus;
import model.Parkeringplads;
import storage.Storage;

public class Controller {

    //Parkeringshus
    public static Parkeringhus createParkeringshus(String adresse, double saldo){
        Parkeringhus parkeringhus = new Parkeringhus(adresse, saldo);
        Storage.addParkeringshuse(parkeringhus);
        return parkeringhus;
    }
    public static void deleteParkeringshus(Parkeringhus parkeringhus){
        Storage.removeParkeringshuse(parkeringhus);
    }

    //Parkeringplads
    public static Parkeringplads createParkering(Parkeringhus parkeringhus, int nummer){
        Parkeringplads parkeringplads = parkeringhus.createParkering(nummer);
        return parkeringplads;
    }
    public static Parkeringplads createParkering(Parkeringhus parkeringhus, int nummer, double areal){
        Parkeringplads parkeringplads = parkeringhus.createParkering(nummer, areal);
        return parkeringplads;
    }

    public static int antalLedigeParkeringsplads(Parkeringhus parkeringhus){
        return parkeringhus.antalLedigePladser();
    }

    public static void parkereBil(Parkeringhus parkeringhus,Bil bil){
        boolean parkeret = false;
        int i = 0;
        while(!parkeret && i<parkeringhus.getParkeringspladser().size()){
            if(parkeringhus.getParkeringspladser().get(i).getBil() == null){
                parkeringhus.getParkeringspladser().get(i).setBil(bil);
                parkeret = true;
            }else if(parkeringhus.getParkeringspladser().get(i).getBil() != null){
                i++;
            }else{
                System.out.println("Phus er fuld!");
            }
        }
    }
    //Biler
    public static Bil createBil(Bilmærke mærke, String regNr){
        Bil bil = new Bil(mærke,regNr);
        Storage.addBiler(bil);
        return bil;
    }
}
