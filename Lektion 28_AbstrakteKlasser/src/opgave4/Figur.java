package opgave4;

public abstract class Figur {
    private int x,y;


    public Figur(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public abstract double beregnAreal();
    public abstract void flytFigur(int x, int y);
}
