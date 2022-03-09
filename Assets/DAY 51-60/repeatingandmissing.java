import java.util.Scanner;

public class repeatingandmissing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int[] res = new int[2];
        int[] f = new int[n+1];

        for (int i = 0; i < a.length; i++) {
            f[a[i]]++;
        }

        for (int i = 1; i < f.length; i++) {
            if(f[i] ==0){
                res[1] = i;
            }
            else if(f[i] ==2){
                res[0] = i;
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        scn.close();
        
    }
}
