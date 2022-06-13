import java.util.HashSet;

public class maxerasureval {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set= new HashSet<Integer>();
        int ans =0,csum =0,i=0,j=0;
        while(i<nums.length && j<nums.length){
            if(!set.contains(nums[i])){
                csum += nums[i];
                set.add(nums[i]);
                ans = Math.max(ans,csum);
                i++;
            }
            else{
                csum -= nums[j];
                set.remove(nums[j]);
                j++;
            }
        }
        return ans;
        
        
    }
}
