package season;
import java.util.Scanner;
public class seasonApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day and month: ");
        season s1 = new season(scan.nextInt(),scan.nextInt());
        System.out.println(s1.getMonth());

        scan.close();
    }

}
