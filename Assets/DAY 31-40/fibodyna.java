import java.util.Scanner;

public class fibodyna {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = fibo(n, new int[n + 1]);
        System.out.println(f);
        scn.close();

    }

    public static int fibo(int n, int[] qb) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (qb[n] != 0) {
            return qb[n];
        }
        int fibo1 = fibo(n - 1, qb);
        int fibo2 = fibo(n - 2, qb);
        int f = fibo1 + fibo2;

        qb[n] = f;
        return f;

    }

}
