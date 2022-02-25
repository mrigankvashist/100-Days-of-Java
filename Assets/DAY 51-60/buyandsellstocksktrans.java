import java.util.Scanner;

public class buyandsellstocksktrans {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int[][] dp = new int[k+1][n];
        for(int t=1;t<=k;t++){
            for(int d =1;d<n;d++){
                int max = dp[t][d-1];

                for(int pd = 0;pd<d;pd++){
                    int ptillm1 = dp[t-1][pd];
                    int ptth = prices[d] - prices[pd];

                    if(ptillm1 + ptth > max){
                        max = ptillm1 + ptth;
                    }
                }
                dp[t][d] = max;
            }
        }
        System.out.println(dp[k][n-1]);



        

        scn.close();
    }

}


