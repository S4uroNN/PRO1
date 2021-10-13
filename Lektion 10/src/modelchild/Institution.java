package modelchild;

import javafx.beans.binding.When;

public class Institution {
    private String navn;
    private String addresse;
    private int numberofstudents;
    private final int MAX_ROOM = 3;
    private String[] pupils = new String[MAX_ROOM];
    private int[] age = new int[MAX_ROOM];
    private boolean[] boy = new boolean[MAX_ROOM];


    public Institution(String navn, String addresse){
        this.navn = navn;
        this.addresse = addresse;


        numberofstudents = 0;
    }
    public void setNavn(String navn){
        navn = this.navn;
    }
    public void setAddresse(String addresse){
        addresse = this.addresse;
    }
    public String getNavn(){
        return navn;
    }
    public String getAddresse() {
        return addresse;
    }
    public void addChild(Child child){
        if(numberofstudents < MAX_ROOM){
            pupils[numberofstudents] = child.getName();
            age[numberofstudents] = child.getAge();
            boy[numberofstudents] = child.isBoy();

            numberofstudents++;
        }else{
            System.out.println("Not enough room");
        }
    }

    public double averageAge(){
        double result = 0.0;
        for(int i = 0 ;i<age.length;i++){
            result = (result +age[i]) / age.length;
        }
        return result;
    }

    public int numberOfBoys() {
        int boys = 0;
        for (int i = 0; i < pupils.length; i++) {
            if (boy[i]) {
                boys++;
            }
        }
        return boys;
    }

        public int numberOfgirls(){
            int girls = 0;
            for(int i = 0; i<pupils.length;i++){
                if(!boy[i]){
                    girls++;
                }
            }
            return girls;
    }
}
