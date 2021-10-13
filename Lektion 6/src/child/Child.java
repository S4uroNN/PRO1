package child;

/**
 * Write a description of class Barn here.
 */
public class Child {
	private int age;
	private boolean boy; // true if the child is a boy

	public Child(int age, boolean boy) {
		this.age = age;
		this.boy = boy;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isBoy() {
		return boy;
	}
	public void setBoy(boolean boy) {
		this.boy = boy;
	}
	public String institution() {
		// TODO: implement!
		String result = "";
		if (age == 0){
			result = "Home";
		}else if (age < 0){
			result = "Your child is not born";
		}else if (age < 3){
			result = "Nursery";
		}else if (age < 6){
			result = "Kindergarden";
		}else if (age < 17){
			result = "School";
		}else if (age > 17)
			result = "Out of school";
		return result;
	}

	public String gender() {
		String gender = "";
		if (boy){
			gender = "Boy";
		}else
			gender  = "Girl";

		return gender;
	}

	public String team(){
		String team = "";
		if(boy && age < 8){
			team = "Young Cubs";
		}else if (boy && age >=8){
			team = "Cool boys";
		}else if (!boy && age < 8){
			team = "Tumbling girls";
		}else if (!boy && age >=8)
			team = "Springy girls";

		return team;

	}
}
