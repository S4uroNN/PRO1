package opgave3;

import java.awt.image.PackedColorModel;

public class TeamApp {
    public static void main(String[] args) {
        Team t1 = new Team("Test");
        Player p1 = new Player("Jens",18);
        p1.addScore(5);
        Player p2 = new Player("Jonas", 25);
        p2.addScore(9);
        Player p3 = new Player("Janson", 24);
        p3.addScore(18);
        Player p4 = new Player("Jenson", 17);
        p4.addScore(28);

        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);

        t1.printPlayer();
        System.out.println("Gennemsnitsalder: " + t1.calcAverageAge());
        System.out.println("Total: " + t1.calcTotalScore());
        System.out.println("Antal mål fra spillere over aldersgræsen: " + t1.calcOldPlayersScore(18));
        System.out.println("Spiller med højest score: " + t1.maxScore());
        System.out.println("Bedste spiller: " + t1.bestPlayer());

    }
}
