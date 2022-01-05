import java.util.Scanner;

public class firstandlastindex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int start = 0;
        int end = arr.length - 1;

        // first index
        int fi = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (d < arr[mid]) {
                end = mid - 1;
            } else if (d > arr[mid]) {
                start = mid + 1;
            } else {
                fi = mid;
                end = mid - 1;
            }
        }
        System.out.println(fi);

        // last index
        start = 0;
        end = arr.length - 1;
        int li = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (d < arr[mid]) {
                end = mid - 1;
            } else if (d > arr[mid]) {
                start = mid + 1;
            } else {
                li = mid;
                start = mid + 1;
            }
        }
        System.out.println(li);
        scn.close();
    }
}
