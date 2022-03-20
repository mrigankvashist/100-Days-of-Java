import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (num == null || num.length == 0)
            return res;
        
        int n = num.length;
    
        Arrays.sort(num); 
    
        for (int i = 0; i < n; i++) {
        
            int target_3 = target - num[i];
        
            for (int j = i + 1; j < n; j++) {
            
                int target_2 = target_3 - num[j];
            
                int front = j + 1;
                int back = n - 1;
            
                while(front < back) {
                
                    int two_sum = num[front] + num[back];
                
                    if (two_sum < target_2) front++;
                
                    else if (two_sum > target_2) back--;
                
                    else {
                    
                        List<Integer> quad = new ArrayList<>(); 
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[front]);
                        quad.add(num[back]);
                        res.add(quad);
                    
                        // Processing the duplicates of number 3
                        while (front < back && num[front] == quad.get(2)) ++front;
                    
                        // Processing the duplicates of number 4
                        while (front < back && num[back] == quad.get(3)) --back;
                
                    }
                }
                
                // Processing the duplicates of number 2
                while(j + 1 < n && num[j + 1] == num[j]) ++j;
            }
        
            // Processing the duplicates of number 1
            while (i + 1 < n && num[i + 1] == num[i]) ++i;
        
        }
        
    
        return res;
    }
};
class foursum {
	public static void main (String[] args) {
		int arr[] = {1,0,-1,0,-2,2}; 
		int target = 0;
		Solution sol = new Solution(); 
		List<List<Integer>> ls = sol.fourSum(arr, target); 
		//System.out.println("raj");
		for(int i = 0;i<ls.size();i++) {
		    for(int j = 0;j<ls.get(i).size();j++) {
		        System.out.print(ls.get(i).get(j) + " "); 
		    }
		    System.out.println(); 
		}
	}
}
//OG CODE:

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         int n = nums.length;
//         ArrayList <List<Integer>> res = new ArrayList<List<Integer>>();
        
//         if(nums == null || nums.length == 0){  // in case array is empty/null
//             return res;  // return empty arraylist
//         }
        
//         Arrays.sort(nums);   //sorting the array
        
//         //creating two pointers [fixed]
//         for(int i =0;i<nums.length;i++){
//             for(int j = i+1;j<nums.length;j++){
//                 int target_2 = target - (nums[j] + nums[i]); 
                
//                 //creating two moving pointers
//                 int front = j+1;
//                 int back = nums.length -1;
                
//                 while(front<back){
//                     int sum2 = nums[front] + nums[back];
                    
//                     if(sum2<target_2){  // if new sum < rqd sum, we need a higher value from the sorted array
//                         front++;
//                     }
//                     else if(sum2>target_2){   // if new sum > rqd sum, we need a lower value from the sorted array
//                         back--;
//                     }
//                     else{   // condition where sum2 is equal to target_2
//                         List<Integer> quad = new ArrayList<Integer>();
//                         quad.add(nums[i]);
//                         quad.add(nums[j]);
//                         quad.add(nums[front]);
//                         quad.add(nums[back]);
//                         res.add(quad);
                        
                        
                        
//                         //processing duplicates of number 3
//                         while(front<back && nums[front] == quad.get(2)){ // element repeat at the front, quad.get(2) since we have stored front at 2nd index
//                             front++;
                        
//                         }
                        
//                         //processing duplicates of number 4
//                         while(front<back && nums[back] == quad.get(3)){ // element repeat at the back, quad.get(3) since we have stored back at 3rd index
//                             back--;
//                         }
//                     }
//                 }
                    
//                     // processing j duplicates
//                     while(j+1<n && nums[j+1] == nums[j]){
//                         j++;
//                     }
//                 }
//             // processing i duplicates
//                     while(i+1<n && nums[i+1] == nums[i]){
//                         i++;
//                     }
//             }
//         return res;
//         }
        
        
        
        
//     }

