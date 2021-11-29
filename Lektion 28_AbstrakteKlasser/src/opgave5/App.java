package opgave5;

public class App {
    public static void main(String[] args) {
        Indkøbskurv k1 = new Indkøbskurv();

        Vare v1 = new Vare("Børste","Damer",100);
        Vare v2 = new Fødevare("Peanuts","Chilli",100,365);
        Vare v3 = new Spiritus("Vodka","XIX",100,40);
        Vare v4 = new Spiritus("Øl","Tuborg",10,4.6);
        Vare v5 = new Elartikel("Støvsuger","Bosch",1000,75);

        k1.addVare(v1);
        k1.addVare(v2);
        k1.addVare(v3);
        k1.addVare(v4);
        k1.addVare(v5);

        k1.showContents();
    }
}
