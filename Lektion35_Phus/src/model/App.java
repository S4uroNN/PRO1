package model;

import java.time.LocalTime;

public class App {

    public static void main(String[] args) {
        Parkeringhus hus1 = new Parkeringhus("Sønderhøj 30",0);

        Parkeringplads p1 = hus1.createParkering(1);
        Parkeringplads p2 = hus1.createParkering(2);
        Parkeringplads p3 = hus1.createParkering(3,25);

        System.out.println("Antal ledige pladser: " + hus1.antalLedigePladser());

        Bil bil = new Bil(Bilmærke.AUDI,"CY 44 019");
        p1.setBil(bil);
        System.out.println(hus1.findAntalBiler(Bilmærke.AUDI));

        System.out.println("Antal ledige pladser: " + hus1.antalLedigePladser());
        System.out.println();
        System.out.println(hus1.findPladsMedBil("CY 44 019"));
        System.out.println(p1.beregnPris(LocalTime.of(14,15)));
        p1.hentBil(LocalTime.of(12,14));
        System.out.println(hus1.getSaldo());

        System.out.println(hus1.findAntalBiler(Bilmærke.AUDI));

    }


}
