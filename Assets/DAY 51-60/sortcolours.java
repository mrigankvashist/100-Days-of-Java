import java.util.Scanner;

public class sortcolours {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int m = 0;
        int l = 0;
        int t = 0;
        int h = a.length - 1;
        while (m <= h) {
            switch (a[m]) {
                case 0:
                    t = a[m];
                    a[m] = a[l];
                    a[l] = t;
                    l++;
                    m++;
                    break;

                case 1:
                    m++;
                    break;

                case 2:
                    t = a[m];
                    a[m] = a[h];
                    a[h] = t;
                    h--;
                    m++;
                    break;

            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        scn.close();

    }

}
