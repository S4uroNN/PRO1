package soegningelevopgaver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Spillermetoder {
    public Spiller findScoreLinear(ArrayList<Spiller> spillere, int score) {
        Spiller spiller = null;
        int i = 0;
        while (spiller == null && i < spillere.size()) {
            Spiller k = spillere.get(i);
            if (k.getMaal() == score) {
                spiller = k;
            } else {
                i++;
            }
        }
        return spiller;
    }

    public Spiller findScoreBinaer(ArrayList<Spiller> spillere, int score) {
        Spiller spiller = null;
        int left = 0;
        int right = spillere.size() - 1;
        while (spiller == null && left <= right) {
            int middle = (left + right) / 2;
            Spiller k = spillere.get(middle);
            if (k.getMaal() == score) {
                spiller = k;
            } else if (k.getMaal() > score) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return spiller;
    }

    public String godSpiller(ArrayList<Spiller> spillere) {
        Spiller spiller = null;
        String navn = "";
        int i = 0;
        while (spiller == null && i < spillere.size()) {
            Spiller k = spillere.get(i);
            if (k.getHoejde() < 170 && k.getMaal() > 50) {
                spiller = k;
                navn = k.getNavn();
            } else {
                i++;
            }
        }
        return navn;
    }

    // Her tilføjes metoder der løser opgve 4.2 og 4.3

    public static void main(String[] args) {
        Spillermetoder metoder = new Spillermetoder();

        // Her afprøves opgave 4.1
        ArrayList<Spiller> spillerListe = new ArrayList<>();
        spillerListe.add(new Spiller("Hans", 196,   99, 15));
        spillerListe.add(new Spiller("Bo", 170, 89, 20));
        spillerListe.add(new Spiller("Jens", 188, 109, 42));
        spillerListe.add(new Spiller("Finn", 168, 102, 49));
        spillerListe.add(new Spiller("Lars", 150, 86, 60));
        spillerListe.add(new Spiller("Mads", 200, 103, 89));

        System.out.println("Spiller der har scoret 15 mål: " + metoder.findScoreLinear(spillerListe, 15));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreLinear(spillerListe, 30));
        System.out.println("Spiller der har scoret 55 mål: " + metoder.findScoreBinaer(spillerListe, 55));
        System.out.println("Spiller der har scoret 56 mål: " + metoder.findScoreBinaer(spillerListe, 56));
        System.out.println("God spiller: " + metoder.godSpiller(spillerListe));


        // Tilføj kode der afprøver opgaver 4.2 og 4.3
    }

}
