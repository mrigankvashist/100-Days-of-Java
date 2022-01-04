import java.util.Scanner;

public class binarysearch {
    public static int binarys(int[] arr, int num) {
        int first = 0;
        int last = arr.length - 1;
        int mid = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            if (num == arr[mid]) {
                break;
            }
            if (num > arr[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }

        }
        return mid;
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = binarys(arr, d);
        System.out.println(ans);
        scn.close();

    }

}
