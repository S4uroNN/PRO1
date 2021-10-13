package opgave3;

import java.util.ArrayList;

public class Player {
    private String name;
    private int age;
    private int score;

    public Player(String name, int age){
        this.name = name;
        this.age = age;
        score = 0;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getScore(){
        return score;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void addScore(int score){
       this.score = score;

    }
}
