package opgave5;

import javax.management.modelmbean.ModelMBeanInfoSupport;
import java.util.ArrayList;

public class Indkøbskurv {
    private ArrayList<Vare> varer = new ArrayList<>();

    public Indkøbskurv() {

    }

    public ArrayList<Vare> getVarer() {
        return new ArrayList<>(varer);
    }

    public void addVare(Vare vare) {
        if (!varer.contains(vare)) {
            varer.add(vare);
        }
    }

    public void removeVare(Vare vare) {
        if (varer.contains(vare)) {
            varer.remove(vare);
        }

    }

    public void showContents() {
        for (Vare v : varer) {
            System.out.println(v.toString());
        }
        double prismedmoms = 0;
        for(Vare v : varer){
            prismedmoms += v.beregnPris();
        }
        double pris = 0;
        for (Vare v: varer) {
            pris += v.getPris();
        }
        System.out.println("Total: " + prismedmoms + " kroner");
        System.out.print("Moms udgør: ");
        System.out.println(prismedmoms - pris);

    }
}
