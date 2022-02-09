import java.util.Scanner;

public class unboundedknapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int[] wts = new int[n];
        for (int i = 0; i < wts.length; i++) {
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        int[] dp = new int[cap + 1];
        dp[0] = 0;
        for (int bagc = 1; bagc < dp.length; bagc++) {
            int max = 0;
            for (int j = 0; j < arr.length; j++) {
                if(wts[j] <= bagc){
                    int rbagc = bagc - wts[j];
                    int rbagv = dp[rbagc];
                    int tbagv = rbagv + arr[j];

                    if(tbagv>max){
                        max = tbagv;
                    } 

                }
            }
            dp[bagc] = max;
        }
        System.out.println(dp[cap]);
     

        scn.close();
    }
}