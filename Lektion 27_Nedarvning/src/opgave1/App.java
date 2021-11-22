package opgave1;

import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;

public class App {
    private static ArrayList<Mekaniker> mekanikers = new ArrayList<>();
    public static void main(String[] args) {


        Mekaniker m1 = new Mekaniker("Jens","Sønderhøj 30",2009,400);
        Mekaniker m2 = new Mekaniker("Mathias","Viby",2007,200);

        Værkfør v1 = new Værkfør("Henrik","viby",2000,400,2002,7000);
        Værkfør v2 = new Værkfør("Tobias","viby",2000,400,2002,7000);

        Synsmand s1 = new Synsmand("Jeppe","Humlum",2005,100,80);
        Synsmand s2 = new Synsmand("Lukas" , "Viby",2006,500,90);

        mekanikers.add(m1);
        mekanikers.add(m2);
        mekanikers.add(v1);
        mekanikers.add(v2);
        mekanikers.add(s1);
        mekanikers.add(s2);

        System.out.println(samletløn());

        v1.setTillæg(0);
        s1.setSyn(0);

        System.out.println(samletløn());
    }
    public static int samletløn(){
        int samletløn = 0;
        for(Mekaniker m: mekanikers){
            samletløn += m.berengLøn();
        }
        return samletløn;
    }


}
