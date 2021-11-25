package opgave3;

public class Mekaniker extends Ansat {
    private int svendeprøveår;
    public Mekaniker(String navn, String adresse, int svenedeprøve, int timesats) {
        super(navn, adresse,timesats);
        this.svendeprøveår = svendeprøveår;
    }

    public double beregnLøn(){
       return getTimesats() * 37;
    }
}
