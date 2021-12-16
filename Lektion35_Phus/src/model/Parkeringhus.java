package model;

import java.util.ArrayList;

public class Parkeringhus {
    private String adresse;
    private double saldo;

    private final ArrayList<Parkeringplads> parkeringspladser = new ArrayList<>();


    public Parkeringhus(String adresse, double saldo) {
        this.adresse = adresse;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setSaldo(double saldo) {
        this.saldo = +saldo;
    }


    //Link metoder
    public ArrayList<Parkeringplads> getParkeringspladser() {
        return new ArrayList<>(parkeringspladser);
    }

    public Parkeringplads createParkering(int nummer) {
        Parkeringplads parkeringplads = new Parkeringplads(nummer);
        parkeringspladser.add(parkeringplads);
        parkeringplads.setParkeringhus(this);
        return parkeringplads;
    }

    public Parkeringplads createParkering(int nummer, double areal) {
        Parkeringplads invalidplads = new Invalidplads(nummer, areal);
        parkeringspladser.add(invalidplads);
        invalidplads.setParkeringhus(this);
        return invalidplads;
    }

    public void removeParkering(Parkeringplads parkeringplads) {
        parkeringspladser.remove(parkeringplads);
        parkeringplads.setParkeringhus(null);
    }

    //metoder
    public int antalLedigePladser() {
        int ledige = 0;
        for (Parkeringplads p : parkeringspladser) {
            if (p.getBil() == null) {
                ledige++;
            }
        }
        return ledige;
    }

    public int findPladsMedBil(String regNr) {
        int result = -1;
        int i = 0;
        while (result == -1 && i < parkeringspladser.size())
            if (parkeringspladser.get(i).getBil() != null) {
                if (parkeringspladser.get(i).getBil().getRegNr().equals(regNr)) {
                    result = parkeringspladser.get(i).getNummer();
                }
            }
        return result;
    }

    public int findAntalBiler(Bilmærke mærke) {
        int antal = 0;
        for (Parkeringplads p : parkeringspladser) {
            if(p.getBil() != null){
                if (p.getBil().getMærke() == mærke) {
                    antal++;
                }
            }

        }
        return antal;
    }


}
