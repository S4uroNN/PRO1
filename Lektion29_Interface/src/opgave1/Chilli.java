package opgave1;

public class Chilli implements Measurable {
    private int styrke;
    private String navn;

    public Chilli(String navn, int styrke) {
        this.navn = navn;
        this.styrke = styrke;
    }

    public int getStyrke() {
        return styrke;
    }

    public void setStyrke(int styrke) {
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Chilli{" +
                "styrke=" + styrke +
                ", navn='" + navn + '\'' +
                '}';
    }

    @Override
    public double getMeasure() {
        return styrke;
    }
}
