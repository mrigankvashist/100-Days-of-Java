import java.util.Scanner;

public class maxsub {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int cm = a[0];
        int msf = a[0];

        for (int i = 1; i < a.length; i++) {
            cm = Integer.max(a[i], a[i]+cm);
            msf = Integer.max(cm, msf);
        }
        System.out.println(msf);


        scn.close();
        
        
    }
    
}