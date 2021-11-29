package opgave5;

public class Vare {
    private double pris;
    private String navn, beskrivelse;
    private double moms;


    public Vare(String navn, String beskrivelse, double pris) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.pris = pris;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public double getMoms() {
        return moms;
    }

    public void setMoms(double moms) {
        this.moms = moms;
    }

    @Override
    public String toString() {
        return navn + '\t' + '\t' + beregnPris();
    }

    public double beregnPris() {
        moms = 25.0 / 100.0;
        return pris + (pris*moms);
    }
}

