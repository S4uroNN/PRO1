package opgave1;

import javax.naming.Name;

public class App {
    public static Measurable max(Measurable[] objects){
      Measurable max = objects[0];
      for(Measurable s : objects){
          if(max.getMeasure() < s.getMeasure()){
              max = s;
          }
      }
      return max;
    }
    public static double avg(Measurable[] objects){
        double strength = 0.0;
        for(Measurable s : objects){
                strength += s.getMeasure();
        }
        return strength / objects.length;
    }
    public static void main(String[] args) {
        Chilli c1 = new Chilli("Smth", 2000);
        Chilli c2 = new Chilli("htmS", 6000);

        Measurable[] measurables = {c1,c2};

        System.out.println(max(measurables));
        System.out.println(avg(measurables));
    }

}
