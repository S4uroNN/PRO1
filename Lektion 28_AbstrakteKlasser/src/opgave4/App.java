package opgave4;


public class App {
    public static void main(String[] args) {
        Cirkel c1 = new Cirkel(5,5,8);
        System.out.println(c1.beregnAreal());
        System.out.println("(" +c1.getX()+"," + c1.getY()+")");
        System.out.println();
        c1.flytFigur(9,9);
        System.out.println("(" +c1.getX()+"," + c1.getY()+")");
    }


}
