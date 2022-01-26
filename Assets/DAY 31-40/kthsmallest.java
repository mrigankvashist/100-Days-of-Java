import java.util.Arrays;
import java.util.Scanner;

public class kthsmallest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
        scn.close();

    }

}
