import java.util.Scanner;

public class diffofarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        int[] diff = new int[n1 > n2 ? n1 : n2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        int c = 0;

        while (k != 0) {
            int d = 0;
            int arr1v = i >= 0 ? arr1[i] : 0;
            if (arr1v <= arr2[j] + c) {
                d = arr2[j] - arr1[i] + c;
                c = 0;
            } else {
                d = arr2[j] + c + 10 - arr1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
        scn.close();

    }
}