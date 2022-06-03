

public class transposerev {
    public static void main(String[] args) {
        
        int[][] a = {{1,2},{3,4}};
        int m = a.length;
        int n = a[0].length;
        int[][] r = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                r[i][j] = a[j][i];
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(r[i][j]+ " ");
            }
            System.out.println();

        }
        
    }
    
}
