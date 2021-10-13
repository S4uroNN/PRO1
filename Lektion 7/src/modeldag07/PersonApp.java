package modeldag07;

public class PersonApp {

    public static void main(String[] args) {
        Person p = new Person("Bent", "Janus", "Christensen", 27, 12, 1995);
        p.printPerson();
        System.out.println("Initialer: " + p.getInit());
        System.out.println("Username: " + p.getUserName());
        System.out.println("Age: " + p.age(26, 12, 2022)); // p's age today
        System.out.println();
        System.out.println();
        // int year = 2021;
        // System.out.println("Er " + year + " skudår: " + p.leapYear(year));
        Person p2 = new Person("Egon", "" , "Christensen", 25,3,2000);
        p2.printPerson();
        System.out.println("Initialer: "+ p2.getInit());
        System.out.println("Username: "+ p2.getUserName());
        System.out.println(p.leapYear(2008));

    }
}
