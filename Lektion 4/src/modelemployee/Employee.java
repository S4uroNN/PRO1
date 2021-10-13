package modelemployee;

/**
 * Klasse der beskriver en ansat
 *
 * @author mad
 *
 */
public class Employee {
	/*
	 * Attributter der beskriver den ansattes tilstand
	 */
	private String firstName;
	private String lastName;
	private boolean trainee;
	private int age;
	private int birthday;


	/*
	 * Constructor, når den ansatte oprettes, skal den have et navn. Ved
	 * oprettelse er den ansatte en trainee
	 */
	public Employee(String firstName, String inputlastName ,int setAge) {

		this.firstName = firstName;

		//firstName = inputfirstName;
		lastName = inputlastName;
		trainee = true;
		age = setAge;
		birthday = + 1;
	}

	/*
	 * Den ansattes navn kan ændres ved kald af setName metoden
	 */
	public void setFirstName(String inputfirstName) {
		firstName = inputfirstName;
	}

	public void setLastName(String inputlastName){
		lastName=inputlastName;
	}


	/*
	 * Man kan få oplyst den ansattes navn, ved at kalde metoden getName
	 */
	public String getFirstName() {
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}

	public void setAge(int setAge) {
		this.age = age;
		return;

	}

	/*
	 * Den ansatte kan få ændret trainee status ved at kalde metoden setTrainees
	 */
	public void setTrainee(boolean isTrainee) {
		trainee = isTrainee;
	}

	/*
	 * Man kan få oplyst den ansatte er trainess aktivitet, ved at kalde metoden
	 * isTrainee
	 */
	public boolean isTrainee() {
		return trainee;
	}

	public void printEmployee() {
		System.out.println("********************************************");
		System.out.println("First Name " + firstName);
		System.out.println("Last Name " + lastName);
		System.out.println("Trainee " + trainee);
		System.out.println("Age " + age);
		System.out.print("Age "); System.out.println(age + birthday);
		System.out.println("********************************************");
	}
}
