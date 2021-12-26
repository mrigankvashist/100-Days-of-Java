import java.util.Scanner;

public class npr {
    public static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int npr = fact(n) / fact(n - r);
        System.out.println(n + "p" + r + "=" + npr);

        scn.close();

    }
}
