package pairofDices;

import java.util.Scanner;

// This class models one pair of dices.
public class PairOfDices {
	Scanner scan = new Scanner(System.in);
	private int sides;
	private int rolls;
	private int sum;
	private int topSum = 0;
	int enere = 0;
	int toere = 0;
	int trere = 0;
	int firere = 0;
	int femere = 0;
	int seksere = 0;
	int ens = 0;
	// The first die in the pair.
	private Die die1;

	//The second die in the pair.
	private Die die2;

	//Constructor for objects of class PairOfDices

	// TODO: put the constructor here!

	public PairOfDices() {
		die1 = new Die();
		die2 = new Die();
	}

	public PairOfDices(int sides) {
		die1 = new Die(sides);
		die2 = new Die(sides);
	}

	public void rollBothDie() {
		die1.roll();
		die2.roll();
		int roll1 = die1.getFaceValue();
		int roll2 = die2.getFaceValue();
		rolls++;
		System.out.println("Du har rullet: " + roll1 + " og " +  roll2 );
		System.out.println("Sum af kast: " + sumOfDie());
		topSum();
		registerRolls();
	}
	public int sumOfDie() {
		sum = die1.getFaceValue() + die2.getFaceValue();
		return sum;
	}

	public int topSum(){
		if(sum > topSum) {
			topSum = sum;
		}
		return topSum;
	}

	public void registerRolls() {
		int faceValue1 = die1.getFaceValue();
		int faceValue2 = die2.getFaceValue();
		if (faceValue1 == 1) {
			enere++;
		} else if (faceValue1 == 2) {
			toere++;
		} else if (faceValue1 == 3) {
			trere++;
		} else if (faceValue1 == 4) {
			firere++;
		} else if (faceValue1 == 5) {
			femere++;
		} else if (faceValue1 == 6) {
			seksere++;
		}
		if (faceValue2 == 1) {
			enere++;
		} else if (faceValue2 == 2) {
			toere++;
		} else if (faceValue2 == 3) {
			trere++;
		} else if (faceValue2 == 4) {
			firere++;
		} else if (faceValue2 == 5) {
			femere++;
		} else if (faceValue2 == 6) {
			seksere++;
		}
		if(faceValue1 == faceValue2){
			ens++;
		}
	}
	public void resetPairOfDices() {
		sum = 0;
		topSum = 0;
		rolls = 0;
		enere = 0;
		toere = 0;
		trere = 0;
		firere = 0;
		femere = 0;
		seksere = 0;
		ens = 0;
	}

	public void gameOver(){
		System.out.println("Tak for spillet du kastede " + rolls + " "
				+ "gange.");
		System.out.println("");
		System.out.println("I dine " + rolls + " " + "Har du rullet følgende: ");
		System.out.println("Højeste rul " + topSum);
		System.out.println("Enere: " + enere);
		System.out.println("Toere: " + toere);
		System.out.println("Trere: " + trere);
		System.out.println("Fiere: " + firere);
		System.out.println("Femere: " + femere);
		System.out.println("Seksere: " + seksere);
		System.out.println("Ens " + ens + " " + " efter: " + rolls);
		scan.close();
		resetPairOfDices();	
	}

	public void playPairOfDice(){
		System.out.println("Welcome to game, wanna roll?");
		boolean finished = false;
		while(!finished){
			System.out.println("Vil du kaste en terning? Angiv Ja eller Nej: ");
			String goOn = scan.nextLine();
			if (goOn.equalsIgnoreCase("Nej")) {
				finished = true;
			} else if(goOn.equalsIgnoreCase("Ja")){

				rollBothDie();
			}else{
				System.out.println("Prøv igen. Angiv Ja eller Nej");
			}
		}
		gameOver();
		}
}
