
public class runningsum {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n-1;i++){
            nums[i+1] = nums[i] + nums[i+1];
        }
        return nums;
        
    }
    public static void main(String args[])
   {
       int arr[]={1,3,2,3,1};
       int[] ans = runningSum(arr);
       for(int i =0;i<ans.length;i++){
       System.out.println(ans[i]);
    }

   }
}
