import java.util.Scanner;
import java.util.Arrays;

public class containsduplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int flag = 0;
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if(a[i-1] == a[i]){
                flag = 1;
            }
            else  flag = 0;
        }
        if(flag==1){
            System.out.println("true");
        }
        else System.out.println("false");

        scn.close();
        
        
    }
    
}
