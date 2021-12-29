import java.util.*;

public class anybasesubtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getDifference(int b, int n1, int n2) {
        int val = 0;
        int mult = 1;
        int c = 0;
        while (n1 != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = 0;
            d1 = d1 + c;
            if (d1 >= d2) {
                c = 0;
                d = d1 - d2 ;

            } else {
                c = -1;
                d = d1 + b - d2;
            }
            val += d*mult;
            mult = mult * 10;
        }
        return val;
    }

}
