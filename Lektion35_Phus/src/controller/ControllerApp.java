package controller;

import model.Bil;
import model.Bilmærke;
import model.Parkeringhus;
import model.Parkeringplads;

public class ControllerApp {
    public static void main(String[] args) {
        Parkeringhus p1 = Controller.createParkeringshus("Havnegade 12, 8200 Århus", 0);
        for (int i = 0; i <= 100; i++) {
            Parkeringplads parkeringplads = Controller.createParkering(p1, i);
        }
        for (int i = 101; i <= 110; i++) {
            Parkeringplads parkeringplads = Controller.createParkering(p1, i, 25);
        }

        System.out.println("Antal ledige pladser: " + Controller.antalLedigeParkeringsplads(p1));

        Bil b1 = Controller.createBil(Bilmærke.HYUNDAI,"AB 11 222");
        Bil b2 = Controller.createBil(Bilmærke.AUDI,"EF 33 444");
        Bil b3 = Controller.createBil(Bilmærke.MERCEDES,"BD 55 666");

        Controller.parkereBil(p1,b1);
        Controller.parkereBil(p1,b2);
        Controller.parkereBil(p1,b3);
        System.out.println("Antal ledige pladser: " + Controller.antalLedigeParkeringsplads(p1));



    }
}
