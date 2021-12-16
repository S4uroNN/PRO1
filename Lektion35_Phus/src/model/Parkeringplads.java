package model;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Parkeringplads {
    private int nummer;
    private LocalTime ankomst;

    private Parkeringhus parkeringhus;
    private Bil bil;

    public Parkeringplads(int nummer) {
        this.nummer = nummer;
        this.ankomst = null;
    }

    public int getNummer() {
        return nummer;
    }

    public void setAnkomst(LocalTime ankomst) {
        this.ankomst = ankomst;
    }

    public LocalTime getAnkomst() {
        return ankomst;
    }

    public Parkeringhus getParkeringhus() {
        return this.parkeringhus;
    }

    public void setParkeringhus(Parkeringhus parkeringhus) {
        if (this.parkeringhus != parkeringhus) {
            this.parkeringhus = parkeringhus;
        }
    }

    public Bil getBil() {
        return this.bil;
    }

    public void setBil(Bil bil) {
        if (this.bil != bil) {
            this.bil = bil;
        }
        setAnkomst(LocalTime.now());
    }
    public void removeBil(Bil bil){
        this.bil = null;
        setAnkomst(null);
    }


    //Metoder
    public double beregnPris(LocalTime sluttidspunkt) {
        long minutterparkeret = ChronoUnit.MINUTES.between(ankomst, sluttidspunkt);
        int heleminutter = (int) minutterparkeret / 10;
        double pris = 0;
        if (minutterparkeret % 10 == 0) {
            pris = heleminutter * 6;
        } else {
            pris = heleminutter * 6 + 6;
        }
        return pris;
    }

    public void hentBil(LocalTime sluttidspunkt){
        double pris = beregnPris(sluttidspunkt);
        parkeringhus.setSaldo(pris);
        removeBil(bil);
    }

    public String toString(){
        return "" + nummer;
    }

}
