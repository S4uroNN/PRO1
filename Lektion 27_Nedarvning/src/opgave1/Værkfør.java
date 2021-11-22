package opgave1;

public class Værkfør extends Mekaniker {
    private int årforudnævelse;
    private int tillæg;


    public Værkfør(String navn, String adresse, int svendeprøve, int timesats, int årforudnævelse, int tillæg) {
        super(navn, adresse, svendeprøve, timesats);
        this.årforudnævelse = årforudnævelse;
        this.tillæg = tillæg;
    }

    public int getÅrforudnævelse() {
        return årforudnævelse;
    }

    public void setÅrforudnævelse(int årforudnævelse) {
        this.årforudnævelse = årforudnævelse;
    }

    public int getTillæg() {
        return tillæg;
    }

    public void setTillæg(int tillæg) {
        this.tillæg = tillæg;
    }
    @Override
    public int berengLøn() {
        return super.berengLøn() + tillæg;
    }

}