import java.util.Scanner;

public class painthouse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();

            }
        }

        long[][] dp = new long[n][3];
        dp[0][0] = a[0][0];
        dp[0][1] = a[0][1];
        dp[0][2] = a[0][2];

        for (int i = 1; i < a.length; i++) {
            dp[i][0] = a[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = a[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = a[i][2] + Math.min(dp[i - 1][1], dp[i - 1][0]);
        }
        long ans = Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
        System.out.println(ans);
        scn.close();

    }

}
