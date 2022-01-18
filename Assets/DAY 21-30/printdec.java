import java.util.Scanner;

public class printdec {
    public static void dec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        dec(n - 1);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        dec(n);
        scn.close();
    }

}
