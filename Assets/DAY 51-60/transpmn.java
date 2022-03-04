import java.util.Scanner;

public class transpmn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<m;j++){
                a[i][j] = scn.nextInt();
            }
        }
        
        int[][] res = new int[n][m];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+" "); 
            }
            System.out.println(); 

        }
        


        scn.close();
    }


}
