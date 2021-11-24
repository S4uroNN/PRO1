package øvelse;

public class Instructor extends Person{

    private double løn;

    public Instructor(String navn, String fødselsår,int løn){
        super(navn, fødselsår);
        this.løn = løn;
    }

    @Override
    public String toString() {
        return super.toString() + ", løn " + løn + " kr}";
    }
}
