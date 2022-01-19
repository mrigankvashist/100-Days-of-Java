import java.util.Scanner;

public class factorialrec {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int f = n * fnm1;
        return f;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fact(n));
        scn.close();

    }
}