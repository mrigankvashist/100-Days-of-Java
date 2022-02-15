import java.util.Scanner;

public class maxsumnonadj {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int inc = a[0];
        int exc = 0;

        for (int i = 1; i < a.length; i++) {
            int ninc = exc + a[i] ;
            int nexc = Math.max(inc, exc);

            inc = ninc;
            exc = nexc;
        }
        System.out.println(Math.max(inc,exc));
        scn.close();


        
    }
    
}
