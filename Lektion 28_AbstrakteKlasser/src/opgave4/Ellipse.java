package opgave4;

public class Ellipse extends Cirkel {
    private int radius2;

    public Ellipse(int x, int y, int radius, int radius2) {
        super(x, y, radius);
        this.radius2 = radius2;
    }

    @Override
    public double beregnAreal() {
        return 3.14 * getRadius() * radius2;
    }

    public void flytFigur(int x, int y) {
        setX(x);
        setY(y);
    }
}
