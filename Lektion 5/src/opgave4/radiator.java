package opgave4;

public class radiator {
    public int temperatur;

    public radiator(){
        this.temperatur = 20;
    }
    public radiator(int temperatur){
        this.temperatur = temperatur;
    }

    public void skruOp(int grader){
        temperatur = temperatur + grader;
    }
    public void skruNed(int grader){
        temperatur = temperatur - grader;
    }
    public void printradiator() {
        System.out.println("Radiator temperatur: " + temperatur);

    }
}

