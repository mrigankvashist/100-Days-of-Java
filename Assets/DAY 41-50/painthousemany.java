import java.util.Scanner;

public class painthousemany {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();
        int[][] a = new int[n][c];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[n][c];
        // for (int i = 0; i < a[0].length; i++) {
        // dp[0][i] = a[0][i];
        // }

        // O(N2)
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for (int i = 0; i < a[0].length; i++) {
            dp[0][i] = a[0][i];

            if (a[0][i] <= least) {
                sleast = least;
                least = a[0][i];

            } else if (a[0][i] <= sleast) {
                sleast = a[0][i];
            }
        }
        for (int i = 1; i < dp.length; i++) {
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
            for (int j = 0; j < dp[0].length; j++) {
                if (least == dp[i - 1][j]) {
                    dp[i][j] = a[i][j] + sleast;

                }
                else {
                    dp[i][j] = a[i][j] + least;

                }
                if (dp[i][j] <= nleast) {
                    nsleast = nleast;
                    nleast = dp[i][j];
    
                } else if (dp[i][j] <= nsleast) {
                    nsleast = dp[i][j];
                }
            }
            least = nleast;
            sleast = nsleast;
        }

        // O(N3)
        // for (int i = 1; i < dp.length; i++) {
        // for (int j = 0; j < dp[0].length; j++) {
        // int min = Integer.MAX_VALUE;

        // for (int k = 0; k < dp[0].length; k++) {
        // if (k != j) {
        // if (dp[i - 1][k] < min) {
        // min = dp[i - 1][k];
        // }
        // }
        // }
        // dp[i][j] = a[i][j] + min;
        // }
        // }
        // int min = Integer.MAX_VALUE;
        // for (int k = 0; k < dp[0].length; k++) {
        // if (dp[a.length - 1][k] < min) {
        // min = dp[a.length - 1][k];
        // }
        // }
        System.out.println(least);
        scn.close();
    }
}
