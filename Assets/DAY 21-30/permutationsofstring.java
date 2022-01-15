import java.util.Scanner;

public class permutationsofstring {
    public static int factorial(int n) {
        int fact = 1;
        while (n != 0) {
            fact = fact * n;
            n = n - 1;
        }
        return fact;
    }

    public static void solution(String s) {
        int n = s.length();
        int f = factorial(n);
        for (int i = 0; i < f; i++) {
            StringBuilder sb = new StringBuilder(s);
            int temp = i;
            for (int div = n; div > 0; div--) {
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str);
        scn.close();
    }

}
