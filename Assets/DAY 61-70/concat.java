import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int[] ans = getConcatenation(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        scn.close();
        
    }
    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[2*nums.length];
        int k = 0;
        for(int i =0;i<nums.length;i++){
            res[k] = nums[i];
            k++;
        }
        for(int i =0;i<nums.length;i++){
            res[k] = nums[i];
            k++;
        }
        return res;
        
    }
}