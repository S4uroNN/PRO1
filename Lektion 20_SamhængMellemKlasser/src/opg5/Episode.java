package opg5;

import java.util.ArrayList;

public class Episode {
    private int number;
    private ArrayList<String> guestCast;
    private int lenghtInMinutes;

    public Episode(int number, ArrayList<String> guestCast, int lenghtInMinutes) {
        this.number = number;
        this.guestCast = guestCast;
        this.lenghtInMinutes = lenghtInMinutes;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<String> getGuestCast(){
        return new ArrayList<String>(guestCast);
    }

    public int getLenghtInMinutes() {
        return lenghtInMinutes;
    }

}
