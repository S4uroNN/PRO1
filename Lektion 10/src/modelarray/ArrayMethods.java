package modelarray;

public class ArrayMethods {
    public void printArray(int[] tabel) {
        System.out.print("{");
        for (int i = 0; i < tabel.length; i++) {
            if (i == 0) {
                System.out.print(tabel[i]);
            } else {
                System.out.print(", " + tabel[i]);
            }
        }
        System.out.println("}  ");
    }

    /**
     * @return et array med indhold [0,0,0,0,0,0,0,0,0,0]
     */
    public int[] fyldArrayA() {
        int[] result = new int[10];
        return result;
    }

    /**
     * @return et array med indhold [2,44,-23,99,8,-5,7,10,20,30]
     */
    public int[] fyldArrayB() {
        int[] result = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        //TODO

        return result;
    }

    /**
     * @return et array med indhold [0,1,2,3,4,5,6,7,8,9]
     */
    public int[] fyldArrayC() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    /**
     * @return et array med indhold [2,4,6,8,10,12,14,16,18,20]
     */
    public int[] fyldArrayD() {
        int[] result = new int[10];
        //TODO
        for (int i = 1; i < result.length; i++) {
            result[0] = 2;
            result[i] = (i + 1) * 2;
        }
        return result;
    }

    /**
     * @return et array med indhold [1,4,9,16,25,36,49,64,81,100]
     */
    public int[] fyldArrayE() {
        int[] result = new int[10];
        //TODO

        for (int i = 1; i <= result.length; i++) {
            result[i - 1] = i * i;
        }
        return result;
    }

    /**
     * @return et array med indhold [0,1,0,1,0,1,0,1,0,1]
     */
    public int[] fyldArrayF() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = i % 2;
        }
        return result;
    }

    /**
     * @return et array med indhold [0,1,2,3,4,0,1,2,3,4]
     */
    public int[] fyldArrayG() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
            if (i >= 5) {
                result[i] = i - 5;
            }

        }
        return result;
    }

    public int findMax(int[] tabel) {
        int max = -1;
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] > max) {
                max = tabel[i];
            }
        }
        return max;
    }


    //  public int sum(double[] t){
    //     int sum = 0;
    //    for(int i = 0; i < t.length; i++)
    //        sum = sum + t[i];
    //   return sum;
    //}
//    public double sum(int[] t) {
//        double sum = 0;
//        for (int i = 0; i < t.length; i++)
//            sum = sum + t[i];
//
//        return sum;
//    }
    public int[] makeSum(int[] a, int[] b) {
        int[] sum = new int[0];
        if (a.length < b.length) {
            sum = new int[b.length];
            for (int i = 0; i < a.length; i++) {
                sum[i] = a[i] + b[i];
            }
            for (int i = a.length; i < b.length; i++) {
                sum[i] = b[i];
            }
            }
        if (a.length > b.length) {
            sum = new int[a.length];
            for (int i = 0; i < b.length; i++) {
                sum[i] = a[i] + b[i];
            }
            for (int i = b.length; i < a.length; i++) {
                sum[i] = a[i];
            }
        }
        return sum;
    }

    // OPGAVE 4 FRA I MANDAGS 06/10/21
    public int[] switchEnds(int[] t){
        int startValue = 0;
        int endValue = 0;
        for(int i = 0;i<t.length;i++){
            if (i == 0){
                startValue = t[i];
            }
            if(i==t.length-1){
                endValue = t[i];
            }
        }
        for(int i = 0;i<t.length;i++){
            if(i == 0){
                t[i] = endValue;
            }
            if(i == t.length-1){
                t[i] = startValue;
            }
        }
        return t;
    }
    public int[] switchPlaces(int[] t){
        int last = 12;
        for(int i = t.length-1;i<t.length;i--){
            if(i == t.length-1){
                last = t[i];
            }
            if(i == 0){
                t[i] = last;
                break;
            }
           t[i] = t[i-1];
        }
        return t;
    }
    public int[] makeEven(int[] t){
        for(int i = 0;i<t.length;i++){
            if (t[i] % 2 == 0){
                t[i] = 0;
            }

        }
        return t;
    }
    public int nextBiggest(int[] t){
        int biggest = 0;
        int nextBiggest = 0;
        for(int i = 0;i<t.length;i++){
            if(t[i] > biggest){
                biggest = t[i];
            }
            if(t[i] >nextBiggest && t[i] < biggest){
                nextBiggest = t[i];
            }
        }
        return nextBiggest;
    }
   public boolean sortUp(int[] t ){
        boolean sorted = false;
        for(int i = 0; i<t.length-1;i++){
            if(t[i] < t[i+1]){
                sorted = true;
            }else{
                sorted = false;
                break;
            }
        }
        return sorted;
    }

}




//        int[] sum = new int[10];
//        for(int i = 0; i<a.length;i++){
//            if(a.length > b.length){
//
//            }
//            sum[i] = a[i] + b[i];
//
//    public boolean hasUneven(int[] t ){
//        boolean uneven = false;
//        for(int i = 0;i<t.length;i++){
//            if(t[i] % 2 == 0){
//                uneven = false;
//            }else {
//                uneven = true;
//            }
//        }
//
//        return uneven;
//    }




