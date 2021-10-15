package opgave2;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SongApp {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Song s1 = new Song("Lille Frække Frederik", "Bamse" , 148 );

        s1.printSong();
        s1.changeBpm(150);
        s1.printSong();
        System.out.println(s1.tilpas(100));

        System.out.println("Vil du tilføje en ny sang?");

        System.out.println("Hvad hedder sangen?");
        String title1 = scan.nextLine();
        System.out.println("Hvad hedder kunstner?");
        String artist1 = scan.nextLine();
        System.out.println("Hvor hurtigt er den angivet i bpm?");
        int bpm1 = scan.nextInt();
        System.out.println("Give second!");

        Song s2 = new Song(title1,artist1,bpm1);
        s2.printSong();

    }

}
