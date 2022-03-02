import java.util.Scanner;

public class setmatrixzero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        int col0 = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i][0] == 0) {
                col0 = 0;
            }
            for (int j = 1; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    a[0][j] = a[i][0] = 0;
                }
            }
        }

        for(int i = a.length-1;i>=0;i--){
            for (int j = a[0].length-1; j >= 1; j--) {
                if(a[i][0] == 0 || a[0][j] == 0){
                    a[i][j] = 0;
                }
            }
            if(col0 == 0){
                a[i][0] = 0;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j]);
            }
        }
        scn.close();
    }
}