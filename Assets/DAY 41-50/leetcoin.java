import java.util.Scanner;

public class leetcoin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = scn.nextInt();
        }
        int amount = scn.nextInt();
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    min = Math.min(min, dp[i - coins[j]] + 1);
                }
            }
            dp[i] = min;
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            System.out.println("-1");
        }
        System.out.println(dp[amount]);
        scn.close();
    }

}
