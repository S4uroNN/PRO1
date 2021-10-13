package opgave3;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();

    public Team(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addPlayer(Player player){
        list.add(player);
    }
    public void printPlayer(){
        for(int i = 0; i<list.size();i++){
            System.out.println("******************");
            System.out.println("Name: " + list.get(i).getName());
            System.out.println("Age: " + list.get(i).getAge());
            System.out.println("Score: " + list.get(i).getScore());
        }
    }
    public double calcAverageAge(){
        double sum = 0.0;
        double average = 0.0;
        for(int i = 0; i<list.size();i++){
            sum = sum + list.get(i).getAge();

            if(list.size()> 0){
                average = sum / list.size();
            }
        }
        return average;
    }
    public int calcTotalScore(){
        int total = 0;
        for(Player player:list){
            total += player.getScore();
        }
        return total;
    }
    public int calcOldPlayersScore(int ageLimit){
        int totalOld = 0;
        for(Player player: list){
            if(player.getAge()>ageLimit){
                totalOld += player.getScore();
            }
        }
        return totalOld;
    }
    public int maxScore(){
        int max = 0;
        for(Player player:list)
            if(player.getScore()>max){
                max = player.getScore();
            }
        return max;
    }
    public String bestPlayer(){
        int bestscore = 0;
        String bestPlayer = "";
        for(Player player : list){
            if(player.getScore() > bestscore){
                bestscore = player.getScore();
                bestPlayer = player.getName();
            }
        }
        return bestPlayer;
    }
}
