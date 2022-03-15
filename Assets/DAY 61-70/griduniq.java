import java.util.Scanner;

public class griduniq {
    public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            int ans = griduniqq(m,n);
            System.out.println(ans);
            scn.close();
    }
    public static int griduniqq(int m, int n) {
       int N = m + n -2;
        int r = m-1;
        double res = 1;
        
        for(int i =1;i<=r;i++){
            res = res * (N-r+i)/i;
        }
        return (int)res;
        
        
    }
   
}