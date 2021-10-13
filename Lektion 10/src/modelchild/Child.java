package modelchild;

/**
 * Write a description of class Barn here.
 */
public class Child {
	private String name;
	private int age;
	private boolean boy; // true if the child is a boy
	private double[] weight = {4.2,9.3,12.4,17.5,23.2,25.3,28.6,30.4,33.9,35.1,37.3};

	public Child(String name, int age, boolean boy) {
		this.name = name;
		this.age = age;
		this.boy = boy;

	}
	public String getName(){
		return name;
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
	public double getWeight(int age){
		return weight[age];
	}
	public double getIncrease(){
		double result = 0;
		result = weight[age] - weight[age-1];
		return result;
	}
}
