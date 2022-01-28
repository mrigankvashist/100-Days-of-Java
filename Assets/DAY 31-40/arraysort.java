import java.util.Scanner;

public class arraysort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        while (mid <= end) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[start];
                arr[start] = temp;
                mid++;
                start++;
            }
            if (arr[mid] == 1) {
                mid++;
            }
            if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                mid++;
                end--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scn.close();

    }

}
