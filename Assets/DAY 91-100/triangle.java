import java.util.List;
public class triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int numrow = triangle.size();  // size of the linked list
        int[] dp = new int[triangle.get(numrow-1).size()]; // dp array of the size of the last row of the triangle. denoted by numrow -1 .size() to find its length
        for(int i =0;i<dp.length;i++){ 
            dp[i] = triangle.get(numrow-1).get(i);  // initialising dp array's value to the values of the last row of the triangle
        }
        for(int row = numrow-2;row>=0;row--){ // starting nested loop of row and col from the second last row till the first (0 index) row
            for(int col=0;col<=row;col++){ // column loop from  0th column till row valued index column (on iterating from left to right)
                dp[col] = Integer.min(dp[col],dp[col+1]) + triangle.get(row).get(col); // finding the minimum at dp array idx in each row between 2 columns, col and col+1 and substituting their value back in the dp + the triangle val already present at that idx. keep finding min for every idx
            }
        }
        return dp[0]; // on reaching the top, returning the 0th idx of the dp
    }
}
