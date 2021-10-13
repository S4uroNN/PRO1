package modelemployee;

/*
 * Anvendelses program der opretter Employee objekter og anvender metoder på disse
 */
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Hans ","Jensen", 58);
		e1.printEmployee();
		e1.setAge(40);


		Employee e2 = new Employee("", "Hansen", 18);
		e2.setFirstName("Jason");
		e2.printEmployee();


		Employee e3 = new Employee("Jens ", "Jespersen" , 66);
		e3.printEmployee();

		Employee e4 = new Employee("Mads ", "Bjerg", 59);
		e4.printEmployee();



	}

}
