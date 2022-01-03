import java.util.Scanner;
import java.lang.Math;

public class inverseofnum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pos = 1;
        int finalnum = 0;
        while (n != 0) {
            int d = n % 10;
            int id = pos;
            int ip = d;
            finalnum +=+ id * (int)Math.pow(10,ip-1);
            n = n / 10;
            pos++;
        }
        System.out.print(finalnum);
        scn.close();
    }

}
