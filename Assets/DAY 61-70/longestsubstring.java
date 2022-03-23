// brute force - O(N^2)
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int maxans = Integer.MIN_VALUE;
//         for(int i =0;i<s.length();i++){
//             Set <Character> se = new HashSet<Character>();
//             for(int j = i;j<s.length();j++){ // // nested loop for getting different  string starting with str[i]
//                 if(se.contains(s.charAt(j))){
//                     maxans = Math.max(maxans,j-i); // // if element if found so mark it as maxans and break from the loop
//                     break;
//                 }
//                 se.add(s.charAt(j)); // if not found, add element to the hashset
//             }
//         }
//         return maxans;
//     }
// }

// OPTIMAL - O(N) --> Since we are only traversing the right pointer, left pointer is just jumping

import java.util.HashMap;
public class longestsubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hmp = new HashMap<Character,Integer>();
        int n = s.length();
        int len = 0;
        int left =0,right = 0; // 2 pointers initialised
        while(right<n){ // while right pointer is within the string limits
            if(hmp.containsKey(s.charAt(right))){ // if we find the character already present at the right key in the hashmap
                left = Math.max(left,hmp.get(s.charAt(right))+1); // we either increment the left by the previous duplicate key + 1, or we keep left unchanged if the duplicate key lies on the left of the "left pointer"
            }
            hmp.put(s.charAt(right),right); // we add the right pointer character in the hashmap and keep updating its key to the newest character from the string
            len = Math.max(len,right-left+1); // right pointer - left pointer + 1 would be the length of the non repeating character
            right++; // incrementing right pointer till it reaches n
        }
        return len;
    }
}
