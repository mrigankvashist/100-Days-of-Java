import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n != 0) {
            int l = n % 10;
            n = n / 10;
            System.out.print(l);
        }

        scn.close();
    }
}
