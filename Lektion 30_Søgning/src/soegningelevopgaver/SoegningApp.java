package soegningelevopgaver;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class SoegningApp {


	 
	
	public static void main(String[] args) {
		Soegning s = new Soegning();
		
		// Kode til afprøvning af opgave 1
		int[] talArray = {2,4,8,2};
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));
		talArray[2] = 15;
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));
		System.out.println();

		//opgave 2

		int[] tabel = {7,56,34,3,7,14,13,4};
		System.out.println(s.findTal(tabel));

		int[] tabel1= {7,9,13,7,9,13};
		int[] tabel2 = {7,9,13,13,9,7};
		System.out.println();
		System.out.println(s.equalNumbers(tabel1));
		System.out.println(s.equalNumbers(tabel2));

		ArrayList<Integer> tabelArr = new ArrayList<>();
		tabelArr.add(5);
		tabelArr.add(10);
		tabelArr.add(15);
		tabelArr.add(7);
		tabelArr.add(8);

		System.out.println(tabelArr);
		System.out.println(s.findAndReplace(tabelArr,7));
		System.out.println(tabelArr);
		System.out.println();
		System.out.println(s.squareRootBinary(10));
		// Her tilføjes kode til at afprøve opgaverne 2,3,5,6 og 7
	}



}
