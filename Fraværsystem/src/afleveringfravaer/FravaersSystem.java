package afleveringfravaer;

import javax.swing.event.InternalFrameAdapter;
import java.sql.SQLOutput;

public class FravaersSystem {
	/**
	 * Fraværstallene udskrives på skærmen
	 *
	 * @param fravaer
	 */
	public void udskrivFravaer(int[][] fravaer) {
		int elev = 1;
		int month = 1;
		System.out.println();
		for (int row = 0; row < fravaer.length; row++) {
			System.out.print("Elev: " + elev + "| ");
			elev++;

					for (int col = 0; col < fravaer[row].length; col++) {
						System.out.print("Måned " + (col+1) + ": " +fravaer[row][col] + "   ");
					}
					System.out.println();

			}
	}



	/**
	 * Returnerer det samlede antal fravaerdage over 12 måneder for eleven med
	 * elevnr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public int samletFravaer(int[][] fravaer, int elevNr) {
		elevNr = elevNr -1;
		int sum = 0;
		for(int i = 0; i<fravaer[elevNr].length;i++){
			sum = sum + fravaer[elevNr][i];
		}

		return sum;

	}

	/**
	 * Returnerer det gennemsnitlige antal fraværsdage pr måned for eleven med
	 * elevNr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public double gennemsnit(int[][] fravaer, int elevNr) {
		int amountOfDays = fravaer[elevNr].length;
		int sum = 0;
		double average = 0;
		int elevnummer = elevNr + 1;
		for(int i = 0;i<fravaer[elevNr].length;i++){
			sum = sum + fravaer[elevNr][i];
		}

		if(amountOfDays>2){
			average = (double) sum /amountOfDays;
		}
		return average;
	}

	/**
	 * Returnerer antallet af elever der ikke har haft fravær i de 12 måneder.
	 *
	 * @param fravaer
	 * @return
	 */
	public int antalUdenFravaer(int[][] fravaer) {
		int udenFravær = 0;
		for(int i = 1;i<fravaer.length;i++){
			if(samletFravaer(fravaer,i)==0){
				udenFravær++;
			}
		}

		return udenFravær;
	}

	/**
	 * Returnerer elevNr for den elev der har haft mest fravær igennem de 12
	 * måneder. Hvis flere elever har haft højst fravær, returneres elevnummer
	 * for en af disse.
	 *
	 * @param fravaer
	 * @return
	 */
	public int mestFravaer(int[][] fravaer) {

		int maxfravær = 0;
		int elev = 0;
		for(int i = 1;i<fravaer.length;i++){
			if(samletFravaer(fravaer,i)> maxfravær){
				maxfravær = samletFravaer(fravaer,i);
				elev = i;
			}
		}
		return elev;
	}

	/**
	 * Registrerer at elenven med elevNr ikke har haft fravær i nogen af de 12
	 * måneder.
	 *
	 * @param fravaer
	 * @param elevNr
	 */
	public void nulstil(int[][] fravaer, int elevNr) {
		elevNr = elevNr-1;
		for(int i = 0; i<fravaer[elevNr].length;i++){
			fravaer[elevNr][i] = 0;
		}

	}
}
