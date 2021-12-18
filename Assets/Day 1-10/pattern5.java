import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1;
        int sp = n - 3;
        for (int i = 1; i < n - 2; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            System.out.println();
            st = st + 2;
            sp = sp - 1;
        }
        for (int i = n - 2; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            System.out.println();
            st = st - 2;
            sp = sp + 1;
        }

        scn.close();
    }
}
