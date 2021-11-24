package øvelse;

import javax.naming.Name;

public class Student extends Person{
    private String fag;


    public Student(String navn, String fødselår,String fag){
        super(navn, fødselår);
        this.fag = fag;
    }

    @Override
    public String toString() {
        return super.toString() + ", fag " + fag + " }";
    }
}
