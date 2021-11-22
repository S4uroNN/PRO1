package opg5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast;
    private ArrayList<Episode> episodes = new ArrayList<>();
    private ArrayList<String> guestCast;

    public Series(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
    }

    public Episode createEpisode(int number, int lenghtInMinutes, ArrayList<String> guestCast) {
        Episode episode = new Episode(number, guestCast, lenghtInMinutes);
        episodes.add(episode);
        return episode;
    }

    public ArrayList<Episode> getEpisodes() {
        return new ArrayList<Episode>(episodes);
    }

    public void removeEpisode(Episode episode) {
        if (episodes.contains(episode)) {
            episodes.remove(episode);
        }
    }

    public int totallenght(){
        int lenght = 0;
        for(Episode s : episodes){
            lenght += s.getLenghtInMinutes();
        }
        return lenght;
    }

    public ArrayList<String> getGuestActors(){
        ArrayList<String> allActors = new ArrayList<>();
        for (Episode s : episodes){
            if (s.getGuestCast().contains(guestCast)) {
                //allActors.add(guestCast.get(s.getGuestCast(indexNr)));
            }
        }
        return new ArrayList<String>(allActors);
    }
    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return new ArrayList<>(cast);
    }
}
