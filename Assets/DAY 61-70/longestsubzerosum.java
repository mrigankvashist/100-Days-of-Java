// //brute force
// //T=O(N^2)
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int max = 0;
//         for(int i =0;i<n;i++){
//             int sum = 0;
//             for(int j = i;j<n;j++){ 
//                 sum+=nums[j];  //Adding sum of each sub array
//                 if(sum == 0){ 
//                     max = Integer.max(max,j-i+1);  // if sum = 0, finding largest continuous subarray by subtracting indexes

//                 }

//             }
//         }
//         return max;

//     }
// }

import java.util.HashMap;

public class longestsubzerosum {
    int maxLen(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        int sum = 0;
        int ml = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                ml = i + 1;
            } else {

                if (hmp.get(sum) != null) {
                    ml = Integer.max(ml, i - hmp.get(sum));
                } else
                    hmp.put(sum, i);
            }
        }
        return ml;
    }
}
