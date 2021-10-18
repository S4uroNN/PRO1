package opgave1;

public class Person {
	private String firstName;
	private String title;
	private String email;
	private boolean senior;

	public Person(String title, String firstName, boolean senior) {
		this.firstName = firstName;
		this.title = title;
		this.senior = senior;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getTitle() {
		return title;
	}

	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		String s = title + " " + firstName;
		if(senior){
			s = s + " (senior)";
		}
		return s;
	}

}
