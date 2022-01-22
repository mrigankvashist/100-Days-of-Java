import java.util.Scanner;

public class maxofarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int max = maxarr(0, arr);
        System.out.println(arr[max]);
    }

    public static int maxarr(int idx, int[] arr) {
        if (idx == arr.length - 1) {
            return idx;
        }
        int max = maxarr(idx + 1, arr);
        if (arr[idx] > arr[max]) {
            max = idx;
            return idx;
        } else {
            return max;
        }
    }
}