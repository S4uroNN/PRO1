package øvelse;

public class App {
    public static void main(String[] args) {
        Person p = new Person("Henrik", "1998");
        Person p1 = new Student("Mathias", "1986","PRO1");
        Person p2 = new Instructor("Mads","1987",5000);

        System.out.println(p.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
