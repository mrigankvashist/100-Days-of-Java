import java.util.Scanner;

public class kadane {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int cur_max = a[0], max_so_far = a[0];
        for (int i = 1; i < a.length; i++) {
            cur_max = Integer.max(a[i], cur_max + a[i]);
            max_so_far = Integer.max(cur_max, max_so_far);
        }
        System.out.println(max_so_far);
        scn.close();
    }

}
