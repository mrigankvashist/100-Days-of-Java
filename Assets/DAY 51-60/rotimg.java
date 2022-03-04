import java.util.Scanner;

public class rotimg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int[][] a = new int[m][m];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<m;j++){
                a[i][j] = scn.nextInt();
            }
        }
        //transpose
        for(int i =0;i<m;i++){
            for(int j=i;j<m;j++){
                int temp = 0;
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // reverse rows
        for(int i=0;i<m;i++){
            for(int j =0;j<m/2;j++){
                int temp = 0;
                temp = a[i][j];
                a[i][j] = a[i][m-1-j];
                a[i][m-1-i] = temp;
            }
        }

        for (int i = 0; i < m; i++) {
            for(int j=0;j<m;j++){
                System.out.println(a[i][j]);
            }
        }


        scn.close();
    }


}
