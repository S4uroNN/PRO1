package opgave3;

public class Arbejdsdrenge extends Ansat{
    public Arbejdsdrenge(String navn, String adresse, int timesats){
        super(navn, adresse,timesats);
    }
    public double beregnLøn(){
        return getTimesats()*25;
    }
}
