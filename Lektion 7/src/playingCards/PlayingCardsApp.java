package playingCards;

import java.util.Scanner;

public class PlayingCardsApp {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter card: ");
       String card = scan.nextLine();
       PlayingCards card1 = new PlayingCards();
        System.out.println(card1.Description(card));
    }
}
