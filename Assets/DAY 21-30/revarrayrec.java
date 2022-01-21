import java.util.Scanner;

public class revarrayrec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        reversearray(0, arr);
        scn.close();
    }

    public static void reversearray(int idx, int[] arr) {
        if (idx == arr.length) {
            return;
        }
        reversearray(idx + 1, arr);
        System.out.println(arr[idx]);

    }

}
