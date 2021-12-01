package opgave2;

public class Customer implements Comparable<Customer>{
    private String name, lastname;
    private int age;

    public Customer(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer customer) {
        int comp = this.lastname.compareTo(customer.getLastname());
        if(comp == 0) {
            comp = this.name.compareTo(customer.getName());
        }
        if(comp == 0){
            comp = age - customer.getAge();
        }
        return comp;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
