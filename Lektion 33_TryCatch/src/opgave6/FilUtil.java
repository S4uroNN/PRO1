package opgave6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilUtil {
    public int max(String filename) throws IOException{
        File filein = new File(filename);
        Scanner scan = new Scanner(filein);
        int max = 0;
        while(scan.hasNext()){
            int j = scan.nextInt();
            if(j > max){
                max = j;
            }
        }

        return max;
    }
}
