package opgave5;

public class Spiritus extends Vare {
    private double alkoholdprocent;
    private double moms;

    public Spiritus(String navn, String beskrivelse, double pris, double alkoholdprocent) {
        super(navn, beskrivelse, pris);
        this.alkoholdprocent = alkoholdprocent;
    }

    public double getAlkoholdprocent() {
        return alkoholdprocent;
    }

    public void setAlkoholdprocent(double alkoholdprocent) {
        this.alkoholdprocent = alkoholdprocent;
    }
    public String toString() {
        return super.toString();
    }
    public double getMoms() {
        return moms;
    }

    @Override
    public double beregnPris() {
        moms = 80.0/100.0;
        if (getPris() > 90){
            moms = 120.0/100.0;
        }

        return getPris() + (getPris()*moms);
    }
}
