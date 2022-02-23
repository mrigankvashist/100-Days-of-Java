import java.util.Scanner;

public class buysellstocktwotrans {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scn.nextInt();
        }

        int mpist = 0;
        int leastsf = prices[0];
        int[] dpleft = new int[prices.length];
        for(int i=1;i<n;i++){
            if(prices[i]<leastsf){
                leastsf = prices[i];
            }
            mpist = prices[i] - leastsf;
            if(mpist > dpleft[i-1]){
                dpleft[i] = mpist;
            }
            else{
                dpleft[i] = dpleft[i-1];
            }
        }

        int mpibt = 0;
        int maxat = prices[prices.length-1];
        int[] dpright = new int[prices.length];

        for (int i = prices.length-2; i >=0 ; i--) {
            if(prices[i] > maxat){
                maxat = prices[i];
            }

            mpibt = maxat - prices[i];
            if(mpibt > dpright[i+1]){
                dpright[i] = mpibt;
            }
            else{
                dpright[i] = dpright[i+1];
            }
            
        }
        int op = 0;
        for (int i = 0; i < prices.length; i++) {
            if(dpleft[i] + dpright[i] > op){
                op = dpleft[i] + dpright[i];
            }
        }
        System.out.println(op);

        scn.close();
    }

}

