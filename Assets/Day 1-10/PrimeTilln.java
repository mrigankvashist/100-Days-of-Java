import java.util.Scanner;

public class PrimeTilln {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int h = scn.nextInt();
        for (int i = l; i <= h; i++) {
            int count=0;
            for(int div=2;div*div<=i;div++){
                if(i%div==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        scn.close();
        
        }
    }

}
