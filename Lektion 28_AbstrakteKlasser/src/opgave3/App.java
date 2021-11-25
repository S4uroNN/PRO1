package opgave3;

import java.util.ArrayList;

public class App {
    private static ArrayList<Ansat> mekanikers = new ArrayList<>();
    public static void main(String[] args) {


        Mekaniker m1 = new Mekaniker("Jens","Sønderhøj 30",2009,400);
        Mekaniker m2 = new Mekaniker("Mathias","Viby",2007,200);

        Værkfør v1 = new Værkfør("Henrik","viby",2000,400,2002,7000);
        Værkfør v2 = new Værkfør("Tobias","viby",2000,400,2002,7000);

        Synsmand s1 = new Synsmand("Jeppe","Humlum",2005,100,80);
        Synsmand s2 = new Synsmand("Lukas" , "Viby",2006,500,90);

        Ansat a1 = new Arbejdsdrenge("Mads" ,"Viby",100);
        Ansat a2 = new Arbejdsdrenge("Mathias","Viby",100);

        mekanikers.add(m1);
        mekanikers.add(m2);
        mekanikers.add(v1);
        mekanikers.add(v2);
        mekanikers.add(s1);
        mekanikers.add(s2);
        mekanikers.add(a1);
        mekanikers.add(a2);

        System.out.println(samletløn());

        v1.setTillæg(0);
        s1.setSyn(0);



        System.out.println(samletløn());
    }
    public static double samletløn(){
        int samletløn = 0;
        for(Ansat m: mekanikers){
            samletløn += m.beregnLøn();
        }
        return samletløn;
    }


}
