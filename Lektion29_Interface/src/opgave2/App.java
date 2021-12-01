package opgave2;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Mathias" , "Bering" ,69);
        Customer c2 = new Customer("Mads" , "Bering" ,70);

        Customer[] customers = {c1,c2};

        System.out.println(lastCustomer(customers));
    }

    public static Customer lastCustomer(Customer[] customers) {
        Customer cust = customers[0];
        for (Customer c : customers) {
            if (c.compareTo(cust) > 0) {
                cust = c;
            }
        }
        return cust;
    }
    public static Customer[] afterCustomer (Customer [] customers,Customer customer){
        Customer[] aftercustomer = customers;
        for(int i = 0; i<customers.length;i++){
            if(customer.compareTo(aftercustomer[i])> 0){
                aftercustomer[i] = null;
            }
        }
        return aftercustomer;
    }

}
