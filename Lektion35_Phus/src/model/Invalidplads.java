package model;

import java.time.LocalTime;

public class Invalidplads extends Parkeringplads {
    private double areal;

    public Invalidplads(int nummer, double areal) {
        super(nummer);
        this.areal = areal;
    }

    public double getAreal() {
        return areal;
    }
    @Override
    public double beregnPris(LocalTime sluttidspunkt){
        return 0;
    }
    @Override
    public String toString(){
        return "" + getNummer() ;
    }
}
