package pig;

import java.util.Scanner;
public class PlayPig {
    Scanner scan = new Scanner(System.in);
    public Die die;
    private int Player1score = 0;
    private int Player2score = 0;
    private boolean turn = true;
    private boolean gameOver = false;

    public PlayPig() {
        die = new Die();
    }

    public void welcomeToGame() {
        System.out.println("Velkommen til spillet PIG");
    }

    public void playerOneTakeTurn() {
        die.roll();
        int faceValue = die.getFaceValue();
        if (faceValue == 1) {
            System.out.println("Du rullede: " + faceValue);
            endTurn();
        } else if (faceValue > 1) {
            Player1score += faceValue;
            System.out.println("Du rullede: " + faceValue);
            System.out.println("Score: " + "Spiller 1: " + Player1score + " Point" + " " + "Spiller 2: " + Player2score + " Point");
        }
        if(Player1score >= 100){
            gameOver = true;
        }
    }

    public void endTurn() {
        if (turn) {
            turn = false;
            System.out.println("Spiller 1 tur er nu færdig.");
            System.out.println("Spiller 1 point den her tur: " + Player1score + " Point");
            System.out.println("Det er nu spiller 2 tur.");
        } else {
            turn = true;
            System.out.println("Spiller 2 tur er nu færdig.");
            System.out.println("Spiller 2 point den her tur: " + Player2score + " Point");
            System.out.println("Det er nu spiller 1 tur.");
        }

    }

    public void playerTwoTakeTurn() {
        die.roll();
        int faceValue = die.getFaceValue();
        if (faceValue == 1) {
            System.out.println("Du rullede: " + faceValue);
            endTurn();
        } else if (faceValue > 1) {
            Player2score += faceValue;
            System.out.println("Du rullede: " + faceValue);
            System.out.println("Score: " + "Spiller 2: " + Player1score + " Point" + " " + "Spiller 2: " + Player2score + " Point");
        }
        if(Player2score >= 100){
            gameOver = true;
        }
    }
   public void gameOver(){
       System.out.println("Spillet er færdigt!");
       if(Player1score >= 100){
           System.out.println("Spiller 1 har vundet!");
       }else if(Player2score >= 100){
           System.out.println("Spiller 2 har vundet!!");
       }
       System.out.println("Final score: " + "Spiller 1: " + Player1score + " Point" + " / " + "Spiller 2 " + Player2score + " Point");
    }

    public void startGame() {
        welcomeToGame();
        System.out.println("Spiller 1 starts!");

        while (!gameOver) {
            System.out.println("Vil du rulle med terningerne? ");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("Nej")) {
                endTurn();
            }
            if (goOn.equalsIgnoreCase("Ja")) {
                if (turn) {
                    playerOneTakeTurn();
                } else {
                    playerTwoTakeTurn();
                }
            }else{
                System.out.println("Prøv igen. Angiv Ja eller Nej");
            }
        }
        gameOver();
    }
}