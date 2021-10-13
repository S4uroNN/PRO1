package opgave3;


public class name {
    public String firstName;
    public String middleName;
    public String lastName;

    public name(String inputfirstName, String inputmiddleName, String inputlastName) {
        firstName = inputfirstName;
        middleName = inputmiddleName;
        lastName = inputlastName;


    }
    public String getInitials(){
        String firstNameInit = firstName.substring(0,1);
        String middleNameInit = middleName.substring(0,1);
        String lastNameInit = lastName.substring(0,1);

        return firstNameInit + middleNameInit + lastNameInit;
    }

    public String getUsername(){
        String firstInit = firstName.substring(0,2);
        int len = middleName.length();
        String lastInit = lastName.substring(lastName.length()-2);

        return firstInit.toUpperCase() + len + lastInit;
    }
    public void printname() {
        System.out.println("********************************************");
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Initials: " + getInitials());
        System.out.println("Username: " + getUsername());
        System.out.println("********************************************");
        }

    }
