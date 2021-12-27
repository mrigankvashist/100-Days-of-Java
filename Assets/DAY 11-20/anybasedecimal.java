import java.util.Scanner;

public class anybasedecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {
        int mult = 1;
        int temp = 0;
        int dec = 0;

        while (n != 0) {
            temp = n % 10;
            n = n / 10;
            dec += temp * mult;
            mult = mult * b;
        }
        return dec;
    }
}
