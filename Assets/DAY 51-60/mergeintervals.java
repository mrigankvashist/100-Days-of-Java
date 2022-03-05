import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class mergeintervals {
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
        
        int[][] res = merge(a);
        for (int i = 0; i < res.length; i++) {
            for(int j=0;j<res[0].length;j++){
                System.out.println(res[i][j]);
            }
        }
        scn.close();
        
        
    }
    public static int[][] merge(int[][] intervals) {
       ArrayList<int[]> res = new ArrayList<>();
       if(intervals.length == 0 || intervals == null){
           return res.toArray(new int[0][]);
       }

       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int s = intervals[0][0];
       int e = intervals[0][1];

       for(int[] i : intervals){
           if(e>= i[0]){
               e = Integer.max(e,i[1]);
           }
           else{
               res.add(new int[]{s,e});
               s= i[0];
               e= i[1];
           }
       }
       res.add(new int[]{s,e});
       return res.toArray(new int[0][]);

        
    }
    
}
