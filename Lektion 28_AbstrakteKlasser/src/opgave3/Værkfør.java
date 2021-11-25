package opgave3;

public class Værkfør extends Ansat {
    private int årforudnævelse;
    private int svendeprøve;
    private int tillæg;


    public Værkfør(String navn, String adresse,int svendeprøve, int timesats, int årforudnævelse, int tillæg) {
        super(navn, adresse,timesats);
        this.årforudnævelse = årforudnævelse;
        this.svendeprøve = svendeprøve;
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
    public double beregnLøn() {
        return (getTimesats() * 37) + tillæg;
    }

}