package afleveringfravaer;

public class AfproevFravaersSystem {

    public static void main(String[] args) {
        int[][] fravaer21S = { { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0 },
                { 5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0 } };

        FravaersSystem fraværsSystem = new FravaersSystem();
        fraværsSystem.udskrivFravaer(fravaer21S);
        System.out.println();
        System.out.println("Fravær i alt for eleven: " + fraværsSystem.samletFravaer(fravaer21S,5));
        System.out.println("Gennemsnitlig fravær: " + fraværsSystem.gennemsnit(fravaer21S,3));
        System.out.println("Antal elever uden fravær: " + fraværsSystem.antalUdenFravaer(fravaer21S));
        System.out.println("Elev med mest fravær: " + fraværsSystem.mestFravaer(fravaer21S));
        fraværsSystem.nulstil(fravaer21S,1);
        fraværsSystem.udskrivFravaer(fravaer21S);


    }
}
