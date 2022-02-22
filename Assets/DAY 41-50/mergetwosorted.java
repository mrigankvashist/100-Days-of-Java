import java.util.Scanner;

public class mergetwosorted {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[] a1 = new int[m];
        int[] a2 = new int[n];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }
        merges(a1, m, a2, n);

        scn.close();
    }

    public static void merges(int[] nums1, int m, int[] nums2, int n) {
        int t1 = m - 1;
        int t2 = n - 1;
        int total = m + n - 1;

        while (t1 >= 0 && t2 >= 0) {
            nums1[total--] = nums1[t1] > nums2[t2] ? nums1[t1--] : nums2[t2--];
        }

        while (t2 >= 0) {
            nums1[total--] = nums2[t2--];
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);

        }
    }
}