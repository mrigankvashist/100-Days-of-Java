import java.util.Scanner;

public class coinchangeperm {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            int amt = scn.nextInt();
            int[] dp = new int[amt + 1];
            dp[0] = 1;
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i >= arr[j]) {
                        dp[i] = dp[i] + dp[i - arr[j]];
                    }
                }
            }
            System.out.println(dp[amt]);

            scn.close();
        }
    }
}