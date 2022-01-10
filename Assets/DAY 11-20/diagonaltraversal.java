import java.util.Scanner;
public class diagonaltraversal {
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for(int g = 0 ;g<arr.length;g++){
            for (int i = 0,j=g; j<arr.length; i++,j++) {
                System.out.println(arr[i][j]);

                
            }
        }

        scn.close();
    }
    
}
