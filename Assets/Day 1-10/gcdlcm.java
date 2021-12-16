import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int rem = a % b;
        int gcd = 0;
        int dividend = a;
        int divisor = b;
        while (rem != 0) {
            rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        gcd = divisor;
        System.out.println("gcd is :" +gcd);
        int lcm = (a*b)/gcd;
        System.out.println("lcm is :" +lcm);
        scn.close();
    }

}
