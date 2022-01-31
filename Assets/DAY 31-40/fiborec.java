import java.util.Scanner;

public class fiborec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = fibo(n);
        System.out.println(f);
        scn.close();

    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = fibo(n - 1);
        int fib2 = fibo(n - 2);
        int fib = fib1 + fib2;
        return fib;
    }

}
