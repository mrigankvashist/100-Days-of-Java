import java.util.Scanner;
public class powxn{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextInt();
        int n = scn.nextInt();

        long nn =  n;
        double ans = 1.0;
        if(nn <0){
            nn = nn * -1;
        }
        while(nn>0){
            if(nn%2 == 1){
                ans = ans * x;
                nn = nn-1;
            }
            else{
                x = x * x;
                nn = nn/2;
            }
        }
        if(n<0){
            ans = 1/ans;
        }
        System.out.println(ans);
        scn.close();


        
    }
}