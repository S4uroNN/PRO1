package opgave5;

public class Elartikel extends Vare{
    private double gennesnitforbrug;
    private double moms;


    public Elartikel(String navn, String beskrivelse, double pris, double gennesnitforbrug){
        super(navn, beskrivelse,pris);
        this.gennesnitforbrug = gennesnitforbrug;
    }
    public double getGennesnitforbrug() {
        return gennesnitforbrug;
    }

    public void setGennesnitforbrug(double gennesnitforbrug) {
        this.gennesnitforbrug = gennesnitforbrug;
    }
    public String toString(){
        return super.toString();
    }
    public double getMoms() {
        return moms;
    }

    @Override
    public double beregnPris() {
        moms = 30.0/100.0;
        double momsafvare = getPris() * moms;
        if(momsafvare <= 3.0){
            momsafvare = getPris() + 3;
        }else {
            momsafvare = getPris() + (getPris()*moms);
        }
        return momsafvare;
    }
}
