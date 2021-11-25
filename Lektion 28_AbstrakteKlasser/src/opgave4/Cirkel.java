package opgave4;

public class Cirkel extends Figur{
    private double radius;



    public Cirkel(int x, int y, int radius){
        super(x,y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double beregnAreal(){
        return 3.14*radius*radius;
    }
    public void flytFigur(int x,int y){
        setX(x);
        setY(y);
    }
}
