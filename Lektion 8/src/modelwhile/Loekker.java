package modelwhile;

import com.sun.source.tree.ReturnTree;

public class Loekker {
	public void udskriv1_10() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");

	}

	public void udskriv1_10_iteration() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public int summer() {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;

		}
		return sum;

	}

	public int summer(int n) {
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		return sum;

	}

	public int multiplum(int a, int b) {
		int resultat = 0;
		int i = 0;
		while (i < a) {
			resultat = resultat + b;
			i++;
		}
		return resultat;

	}

	public int summerEven() {
		// TODO Opgave 1.a
		int resultat = 0;
		int i = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				resultat = resultat + i;
			}
			i++;

		}
		return resultat;
	}

	public int summerSquare() {
		// TODO Opgave 1.b
		int resultat = 0;
		int i = 0;
		while (i <= 10) {
			resultat = resultat + i * i;
			i++;
		}

		return resultat;
	}

	public void allPowers() {
		// TODO Opgave 3.a
		int i = 2;
		int power = 0;
		while (power <= 20) {
			System.out.println(Math.pow(i, power));
			power++;
		}
	}

	public int sumOdd(int a, int b) {
		// TODO Opgave 3.b
		int resultat = 0;
		int i = a;
		while (i <= b) {
			if (i % 2 == 1) {
				resultat = resultat + i;
			}
			i++;

		}return resultat;
	}

		public int sumOfOddDigits(int number){
		// TODO Opgave 3.c
			int resultat = 0;
			while(number > 0){
				if(number % 2 != 0){
					resultat = resultat + (number%10);
				}
				number = number / 10;
			}
			return resultat;
		}

}

