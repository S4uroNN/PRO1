package opgave1;

public class Synsmand extends Mekaniker {
    private int syn;


    public Synsmand(String navn, String adresse, int svendeprøve, int timesats, int syn) {
        super(navn, adresse, svendeprøve, timesats);
        this.syn = syn;
    }

    public int getSyn() {
        return syn;
    }

    public void setSyn(int syn) {
        this.syn = syn;
    }

    @Override
    public int berengLøn() {
        return super.berengLøn() + (syn * 29);
    }
}
