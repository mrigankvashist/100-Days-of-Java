import java.util.Scanner;

public class partitionsubs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        if(n==0 || k==0){
            System.out.println(0);
            return;
        }

        long[][] dp = new long[k+1][n+1];
        for (int t = 1; t < dp.length; t++) {
            for (int p = 1; p < dp[0].length; p++) {
                 if(p<t){
                     dp[t][p] = 0;
                 }
                 else if(p==t){
                     dp[t][p] = 1;
                 }
                 else{
                     dp[t][p] = t * dp[t][p-1] + dp[t-1][p-1];
                 }
            }
            
        }
        System.out.println(dp[k][n]);
        scn.close();
    }
    
}
