package opgave5;

public class Fødevare extends Vare{


    private int holdbarhedsdage;
    private double moms;

    public Fødevare(String navn, String beskrivelse, double pris,int holdbarhedsdage){
        super(navn, beskrivelse,pris);
        this.holdbarhedsdage = holdbarhedsdage;
    }
    public int getHoldbarhedsdage() {
        return holdbarhedsdage;
    }

    public void setHoldbarhedsdage(int holdbarhedsdage) {
        this.holdbarhedsdage = holdbarhedsdage;
    }
    public String toString() {
        return super.toString();
    }
    public double getMoms(){
        return moms;
    }
    @Override
    public double beregnPris() {
        moms = 5.0/100.0;
        return getPris() + (getPris()*moms);
    }
}
