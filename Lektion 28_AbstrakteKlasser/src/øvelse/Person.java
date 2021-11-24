package øvelse;

public class Person {
    private String navn;
    private String fødselsår;

    public Person(String navn, String fødselsår){
        this.navn = navn;
        this.fødselsår = fødselsår;
    }

    @Override
    public String toString() {
        return "Person{" +
                "navn'" + navn + '\'' +
                ", fødselsår='" + fødselsår + '\'';
    }
}
