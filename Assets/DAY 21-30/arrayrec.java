import java.util.Scanner;

public class arrayrec {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        recarray(n, arr);
        scn.close();
    }

    public static void recarray(int n, int[] arr) {
        if (n == 0) {
            return;
        }
        recarray(n - 1, arr);
        System.out.println(arr[n - 1]);
    }
}
