package opg2;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Gift> gifts = new ArrayList<>();


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ArrayList<Gift> getGifts(){
        return new ArrayList<>(gifts);
    }

    public void recieveGift(Gift gift){
        if(!gifts.contains(gift)){
            gifts.add(gift);
        }
    }
    public void removeGift(Gift gift){
        if(gifts.contains(gift)){
            gifts.remove(gift);
        }
    }

    public double getGiftPrice(){
        double price = 0.0;
        for(Gift s : gifts){
            price += s.getPrice();
        }
        return price;
    }
    public String getSenderName(){
        String sender = "";
        for(Gift s : gifts){
            sender = s.getPerson().getName();

        }
        return sender;
    }

    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
