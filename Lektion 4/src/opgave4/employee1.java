package opgave4;

public class employee1 {
        private String firstName;
        private String lastName;
        private String address;
        double monthlySalary;

        public employee1(String inputfirstName, String inputlastName, String inputAddress, double inputSalary){
            firstName = inputfirstName;
            lastName = inputlastName;
            address = inputAddress;
            monthlySalary = inputSalary;

    }
    public void setFirstName(String inputfirstName) {
        firstName = inputfirstName;
    }
    public void setLastName(String inputlastName){
            lastName = inputlastName;
    }
    public void setAddress(String inputAddress){
            address = inputAddress;
    }
    public int getpreviousWork(){
            int previousWork = 1;
            return previousWork;
    }

    public double getAnnualSalary(){
            double annualSalary = (monthlySalary * 12)*1.025;
            return annualSalary;
    }




    public void printemployee1() {
        System.out.println("********************************************");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: "  + lastName);
        System.out.println("Address: "+ address);
        System.out.println("Monthly Salary: "+ monthlySalary);
        System.out.println("Annual salary: " + getAnnualSalary());
        System.out.println("Previous work: " +  getpreviousWork());
        System.out.println("********************************************");


    }
}

