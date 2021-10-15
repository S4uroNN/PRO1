package opgave2;
import java.util.Scanner;
public class Song {
    Scanner scan = new Scanner(System.in);
    private String title;
    private String artist;
    private int bpm;


//    public Song(String title, String artist,int bpm){
//        this.title = title;
//        this.artist = artist;
//        this.bpm = bpm;
//    }

    public Song(String title, String artist,int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getBpm(){
        return bpm;
    }

    public String tilpas(int bpm){
        String hastighed = "";
        if(bpm < 130){
            hastighed = "Langsom";
        }else if(bpm == 130){
            hastighed = "Perfekt";
        }else if(bpm >130){
            hastighed = "Hurtig";
        }
        return hastighed;
    }


    public void changeBpm(int cbpm){
        bpm = cbpm;
    }
    public void printSong(){
        System.out.println(" *********************** ");
        System.out.println("Title: " + title);
        System.out.println("Kunstner: " + artist);
        System.out.println("hastighed: " + bpm + " (bpm)");
        System.out.println(" *********************** ");
    }
}
