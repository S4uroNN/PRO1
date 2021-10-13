package pin;
import java.util.Scanner;
public class pin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kode = 1234;

        System.out.println("Velkommen! Indtast din pinkode: ");
        if(scan.nextInt() == kode) {
            System.out.println("You so good, it correct");
        }else{
            System.out.println("Wrong pin code, try again: ");
            System.out.println("2 Attempts left");
            }if(scan.nextInt() == kode) {
            System.out.println("You so good, it correct");
            }else{
            System.out.println("Wrong pin code, try again: ");
            System.out.println("1 Attempt left");
            }if(scan.nextInt() == kode){
            System.out.println("You so good, it correct");
            }else{
            System.out.println("Wrong pin code, you are know shut out, please contact your bank");
        }
        scan.close();
    }
}
