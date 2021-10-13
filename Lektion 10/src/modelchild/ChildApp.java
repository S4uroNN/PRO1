package modelchild;

public class ChildApp {

	public static void main(String[] args) {
		Child c1 = new Child("Jens", 4, true);// boy 4 years old
		Child c2 = new Child("Lise", 2,false);// girl 2 years old
		Child c3 = new Child("Jesper", 7, true);

		System.out.println("***************************");
		System.out.println("Et barn på " + c1.getAge());
		System.out.println("Barnet vejede " + c1.getWeight(4));
		System.out.println("Barnets vægt voksede med " + c1.getIncrease());
		System.out.println("Dreng eller pige: " + c1.isBoy());
		System.out.println();
		System.out.println("***************************");
		System.out.println("Et barn på " + c2.getAge());
		System.out.println("Barnet vejede " + c2.getWeight(2));
		System.out.println("Barnets vægt voksede med " + c2.getIncrease());
		System.out.println("Dreng eller pige: " + c2.isBoy());
		System.out.println();
		System.out.println("***************************");
		System.out.println("Et barn på " + c3.getAge());
		System.out.println("Barnet vejede " + c3.getWeight(7));
		System.out.println("Barnets vægt voksede med " + c3.getIncrease());
		System.out.println("Dreng eller pige: " + c3.isBoy());
		System.out.println();


		Institution i1 = new Institution("Ramme Skole", "Algade 52");
		i1.addChild(c1);
		i1.addChild(c2);
		i1.addChild(c3);
		System.out.println("Skolens navn og adresse: " + i1.getNavn() + " , " + i1.getAddresse());
		System.out.println("Average age for this insitution: " + i1.averageAge());
		System.out.println("Antal drenge: " + i1.numberOfBoys());
		System.out.println("Antal piger: " + i1.numberOfgirls());

	}

}