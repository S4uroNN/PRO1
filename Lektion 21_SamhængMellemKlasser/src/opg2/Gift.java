package opg2;

public class Gift {
    private String description;
    private double price;
    private Person person;

    public Gift(String description,Person person) {
        this.description = description;
        this.person = person;
    }

    public String getDescription(){
        return description;
    }
    public double getPrice() {
        return price;

    }
    public Person getPerson(){
        return person;
    }

        public void setPrice(double price) {
        this.price = price;
    }


}
