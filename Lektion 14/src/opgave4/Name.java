package opgave4;

public class Name {
    private String name;
    public Name(String name){
        this.name = name;
    }

    public String getFirstName(){
        return name;
    }
    @Override
    public String toString(){
        String s = name;
        return s;
    }
}
