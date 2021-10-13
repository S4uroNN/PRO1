package model;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class MethodsArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(18);
		list.add(34);
		list.add(0);
		list.add(7);
		list.add(9);
		list.add(16);
		MethodsArrayList methods = new MethodsArrayList();
		System.out.println(list);
		System.out.println("Summen af tallene i listen med for "
				+ methods.sumListe(list));
		System.out.println("Summen af tallene i listen med forEach "
				+ methods.sumListe2(list));

		System.out.println("Indeks for det første lige tal: "
				+ methods.hasEvenAtIndex(list));

		System.out.println("Mindste tal i listen: " + methods.minNumber(list));
		System.out.println("Average: " + methods.average(list));
		System.out.println("Antal nullere: " + methods.countZeros(list));
	//	methods.swapEvenWithZero(list);
		System.out.println(list);

		System.out.println(methods.aEvenList(list));
	}

}
