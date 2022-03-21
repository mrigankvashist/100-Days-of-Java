// og bruteforce ----------------->
// T = O(NLogN) + O(N);
// S = O(1);
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums== null || nums.length == 0){  // returning for an empty array
//             return 0;
//         }
//         Arrays.sort(nums);  // sorting the array
//         int prev = nums[0]; // stroring the value of first element as the previous variable to compare later
//         int curr = 1;
//         int ans = 1;  // to be returned
//         for(int i = 1;i<nums.length;i++){ // starting from 1 so as to compare the elements from nums[0] onwards
//             if(nums[i] == prev + 1){  // checking if the numbers are continuous 
//                 curr ++;  // incrementing current sequence
//             }
//             else if(nums[i] != prev){  // if element is different or != prev + 1, only then curr is re initialised as 1
//                 curr = 1;  // 
//             }
//             prev = nums[i];  // initialising the next previous for the iteration as the present nums[i]
//             ans = Integer.max(ans,curr); // assigning the value of ans as the "longest continuous number"
//         }
//         return ans;
        
        
//     }
// }

// optimal ----->
// T = O(N);
// S = O(N);
import java.util.HashSet;
import java.util.Set;
public class longestconssub {
    public int longestConsecutive(int[] nums) {   
        if(nums== null || nums.length == 0){   // returning for an empty array
            return 0;
        }
        Set<Integer> hashSet = new HashSet<Integer>();  // Creating hashset
        for(int num:nums){
            hashSet.add(num);  // copying array to hashset
        }
        int longeststreak = 1;  // to be returned
        for(int num : nums){
            if(!hashSet.contains(num-1)){  // if previous element is absent from hashset, then only we will increment and check the next larger element ( currnum + 1)
                int currnum = num;  // initiliasing a current number because we dont want to alter our num variable
                int currstreak = 1; 
                while(hashSet.contains(currnum + 1)){ // if the next consecutive element is present in hashset, we will incremenent number by 1 (i.e next continous)  and streak by 1 
                    currnum++;
                    currstreak++;
                }
                longeststreak = Integer.max(currstreak,longeststreak);  // find the longest consecutive solution and return its value
            }
        }
        return longeststreak;
        
    }
}