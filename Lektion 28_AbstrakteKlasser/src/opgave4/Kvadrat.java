package opgave4;

public class Kvadrat extends Figur{
    private int side;


    public Kvadrat(int x, int y, int side){
        super(x,y);
        this.side = side;
    }
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public double beregnAreal(){
        return side*side;
    }
    public void flytFigur(int x,int y){
        setX(x);
        setY(y);
    }
}
