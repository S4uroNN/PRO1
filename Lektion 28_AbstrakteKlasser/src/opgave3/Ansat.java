package opgave3;

public abstract class Ansat extends Person{
    private int svendeprøveår;
    private int timesats;


    public Ansat(String navn, String adresse, int timesats){
        super(navn, adresse);
        this.timesats = timesats;

    }
    public int getSvendeprøveår() {
        return svendeprøveår;
    }

    public void setSvendeprøveår(int svendeprøveår) {
        this.svendeprøveår = svendeprøveår;
    }

    public int getTimesats() {
        return timesats;
    }

    public void setTimesats(int timesats) {
        this.timesats = timesats;
    }

    public abstract double beregnLøn();

}
