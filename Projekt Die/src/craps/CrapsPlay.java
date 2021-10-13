package craps;


import java.util.Scanner;

public class CrapsPlay {
    private Die die1;
    private Die die2;
    private boolean vundet = false;
    private int rolls = 0;
    private int comeOutRoll = 0;
    private boolean finished = false;
    Scanner scan = new Scanner(System.in);

    public CrapsPlay() {
        die1 = new Die();
        die2 = new Die();

    }

    private void welcomeToGame() {
        System.out.println("Velkommen til Craps!");
    }

    private void gameOver() {
        System.out.println("Tak for du spillede!");
        if (vundet) {
            System.out.println("Tillykke! Du har vundet");
        } else {
            System.out.println("Desværre, du tabte");
        }
    }

    public void takeTurn() {
        rolls++;
        die1.roll();
        die2.roll();
        int sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Du har rullet :" + sum);


        if (rolls == 1) {
            if (sum == 7 || sum == 11) {
                finished = true;
                vundet = true;
                gameOver();
            } else if (sum == 2 || sum == 3 || sum == 12) {
                finished = true;
                vundet = false;
                gameOver();
            }
            comeOutRoll = sum;
        } else if (rolls > 1) {
            if (sum == 7) {
                vundet = false;
                gameOver();
            } else if (sum != comeOutRoll) {
                vundet = false;
            } else {
                vundet = true;
                finished = true;
                gameOver();
            }
        }


    }


    public void startGame() {
        welcomeToGame();


            while (!finished) {
                System.out.println("Vil du kaste en terning? Angiv Ja eller Nej: ");
                String goOn = scan.nextLine();
                if (goOn.equalsIgnoreCase("Nej")) {
                    finished = true;
                    gameOver();
                } else if (goOn.equalsIgnoreCase("Ja")){
                    takeTurn();
                }else{
                    System.out.println("Prøv igen. Angiv ja eller nej");
                }

            }

    }

}