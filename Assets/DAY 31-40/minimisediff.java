import java.util.Scanner;

public class minimisediff {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int ans = a[n - 1] - a[0];
        int smallest = a[0] + k;
        int largest = a[n - 1] - k;
        int min = 0, max = 0;
        for (int i = 0; i < n-1; i++) {
            min = Integer.min(smallest,a[i + 1] - k );
            max = Integer.max(largest,a[i] + k);
            if (min < 0) {
                continue;
            }
            ans = Integer.min(ans, max - min);
        }
        System.out.println(ans);
        scn.close();

    }

}
