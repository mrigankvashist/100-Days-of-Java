import java.util.Scanner;

public class firstindex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int f = firstin(0, d, arr);
        System.out.println(f);
        scn.close();
    }

    public static int firstin(int idx, int d, int[] arr) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == d) {
            return idx;
        } else {
            int f = firstin(idx + 1, d, arr);
            return f;
        }

    }

}
