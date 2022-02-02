import java.util.Scanner;

public class climbstairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s = climbst(n);
        System.out.println(s);
        scn.close();
    }

    // Recursion:-

    // public static int climbst(int n) {
    // if(n==0){
    // return 1;
    // }
    // if(n<0){
    // return 0;
    // }
    // int cnm1 = climbst(n-1);
    // int cnm2 = climbst(n-2);
    // int cnm3 = climbst(n-3);
    // int c = cnm1 +cnm2 +cnm3;
    // return c;

    // }

    // Dynamic Programming - Memoization :-

    // public static int climbst(int n, int[] qb) {
    // if (n == 0) {
    // return 1;
    // }
    // if (n < 0) {
    // return 0;
    // }
    // if (qb[n] != 0) {
    // return qb[n];
    // }
    // int cm1 = climbst(n - 1, qb);
    // int cm2 = climbst(n - 2, qb);
    // int cm3 = climbst(n - 3, qb);

    // int c = cm1 + cm2 + cm3;
    // qb[n] = c;
    // return c;

    // }

    // Dynamic Programming - Tabular Method

    public static int climbst(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <n+1; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            }
            else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];

            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }

}
