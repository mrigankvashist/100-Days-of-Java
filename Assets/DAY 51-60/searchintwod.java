import java.util.Scanner;

public class searchintwod {
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
        int t = scn.nextInt();
        boolean ans = searchMatrix(a, t);
        System.out.println(ans);
        scn.close();
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int flag = 0;
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                flag = 1;
                break;
            } else if (matrix[i][j] > target) {
                j--;
            } else
                i++;
        }
        if (flag == 1) {
            return true;
        } else
            return false;
    }

}

//optimal:
// public boolean searchMatrix(int[][] matrix, int target) {
//     int m = matrix.length;
//     int n = matrix[0].length;
//    int f = 0;
//    int l = m*n-1;
//    while(f<=l){
//        int mid = (f+l)/2;
//        if(matrix[mid/n][mid%n]== target){
//            return true;
//        }
//        else if(matrix[mid/n][mid%n] > target){
//            l = mid-1;
//        }
//        else{
//            f= mid +1;
//        }
//    }
//     return false;
// }
