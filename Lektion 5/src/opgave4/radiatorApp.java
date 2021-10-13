package opgave4;

public class radiatorApp {
    public static void main(String[] args) {

        radiator r1 = new radiator( );
        radiator r2 = new radiator(35);

        r1.printradiator();
        r1.skruOp(5);
        r2.skruNed(8);
        r2.printradiator();
    }
}
