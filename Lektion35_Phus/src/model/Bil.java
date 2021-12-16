package model;

public class Bil {
    private Bilmærke mærke;
    private String regNr;

    public Bil(Bilmærke mærke, String regNr) {
        this.mærke = mærke;
        this.regNr = regNr;
    }
    public Bilmærke getMærke(){
        return mærke;
    }
    public String getRegNr() {
        return regNr;
    }
}
