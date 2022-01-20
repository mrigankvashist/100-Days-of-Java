import java.util.Scanner;

public class powlog {
    public static int powerlog(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int sqrt = powerlog(x, n / 2);
        int val = 1;
        if (n % 2 == 0) {
            val = sqrt * sqrt;
        } else {
            val = sqrt * sqrt * x;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powerlog(x, n));
        scn.close();

    }
}