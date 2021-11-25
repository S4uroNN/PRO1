package opgave4;

public class Rektangle extends Kvadrat{
    private int side2;
    public Rektangle(int x, int y, int side, int side2){
        super(x,y,side);
        this.side2 = side2;
    }
    @Override
    public double beregnAreal(){
        return getSide()*side2;
    }
    public void flytFigur(int x,int y){
        setX(x);
        setY(y);
    }
}
