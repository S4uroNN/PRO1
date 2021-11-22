package opgave1;

public class Mekaniker extends Person {
    private int svendeprøveår;
    private int timesats;


    public Mekaniker(String navn, String adresse, int svenedeprøve, int timesats) {
        super(navn, adresse);
        this.svendeprøveår = svenedeprøve;
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

    public int berengLøn(){
        int ugeløn = 0;
        ugeløn += timesats * 37;
        return ugeløn;
    }
}
