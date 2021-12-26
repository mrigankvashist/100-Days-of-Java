import java.util.Scanner;

public class digitfreq {
    public static int count(int x, int p) {
        int cnt = 0;
        while (x != 0) {
            int temp = x % 10;
            if (temp == p) {
                cnt++;
            }
            x = x / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int p = scn.nextInt();
        int df = count(x, p);
        System.out.println("number of " + p + " in " + x + " = " + df);
        scn.close();

    }
}