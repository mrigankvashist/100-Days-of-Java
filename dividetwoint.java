import java.util.Scanner;
public class dividetwoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dividend = scn.nextInt();
        int divisor = scn.nextInt();
        if(dividend == Integer.MIN_VALUE && divisor == -1){ //Corner case when -2^31 is divided by -1 will give 2^31 which doesnt exist so overflow 
            System.out.println(Integer.MAX_VALUE);
        }
        boolean negative = dividend < 0 ^ divisor < 0; //Logical XOR will help in deciding if the results is negative only if any one of them is negative
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;
        int subquot = 0;
        while (dividend - divisor >= 0) {
            for (subquot = 0; dividend - (divisor << subquot << 1) >= 0; subquot++);
            quotient += 1 << subquot; //Add to the quotient
            dividend -= divisor << subquot; //Substract from dividend to start over with the remaining
        }
        System.out.println(negative ? -quotient : quotient);

    }
}
