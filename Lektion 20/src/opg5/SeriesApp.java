package opg5;

import java.util.ArrayList;

public class SeriesApp {
    public static void main(String[] args) {
        ArrayList<String> cast = new ArrayList<>();
        cast.add("Actor 1");
        cast.add("Actor 2");
        cast.add("Actor 3");
        cast.add("Actor 4");
        cast.add("Actor 5");
        ArrayList<String> guestCast = new ArrayList<>();
        guestCast.add("Acton 1");
        guestCast.add("Actor 2");
        guestCast.add("Actor 3");

        Series s1 = new Series("Diaries", cast);

        Episode e1 = s1.createEpisode(1,45,guestCast);
        Episode e2 = s1.createEpisode(2,45,guestCast);

        for(Episode s : s1.getEpisodes()){
            System.out.println(s.getNumber());
        }
        System.out.println(s1.totallenght());

    }
}
