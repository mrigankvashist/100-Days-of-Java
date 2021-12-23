import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 2;
        int st = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                

            }
            if(i<=n/2){
                st++;
            }
            else st--;
        }


        

        

        scn.close();
    }

}