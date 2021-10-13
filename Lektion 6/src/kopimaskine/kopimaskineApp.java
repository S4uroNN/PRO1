package kopimaskine;

public class kopimaskineApp {
    public static void main(String[] args) {

        System.out.println("What do you need copying");
        kopimaskine k1 = new kopimaskine("");
        System.out.println("Okay, will do");
        if(k1.ranOut()){
            System.out.println("OUT OF FUCKING PAPER!");
            k1.paperInput();
        }else {
            k1.copy();
        }

    }
}
