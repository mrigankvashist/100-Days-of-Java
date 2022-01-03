import java.util.Scanner;

public class inversearray {
    public static int[] inverse(int[] a) {
        int[] inv = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            inv[v] = i;
        }
        return inv;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] fv=inverse(arr);
        for(int i=0;i<fv.length;i++){
            System.out.print(fv[i]+" ");
        }
        

        scn.close();

    }

}
