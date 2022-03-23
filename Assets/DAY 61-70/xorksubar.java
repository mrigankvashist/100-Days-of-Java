// import java.util.Scanner;

// public class xorksubar {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] a = new int[n];
//         for(int i =0;i<n;i++){
//             a[i] = scn.nextInt();
//         }
//         int targ = scn.nextInt();

//brute force - kadane
// int cnt = 0;
// for(int i =0;i<n;i++){
//     int curr_xor = 0;
//     for(int j =i;j<n;j++){
//         curr_xor ^= a[j];
//         if(curr_xor == targ){
//             cnt++;
//         }
//     }
// }
// System.out.println(cnt);

//         scn.close();

//     }

// }

// T = O(N) , S = O(N)

import java.util.HashMap;
import java.util.Scanner;

public class xorksubar {
    public static int subarraysXor(int[] arr, int x) {
        // Write your code here.
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>(); // Hashmap storing the xor,frequency for each
                                                                          // iteration
        int cnt = 0; // count to be returned
        int xor = 0; // xor calculated for each iteration
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i]; // calculating xor from the first element
            if (freq.get(xor ^ x) != null) { // if xor ^ number reqd is not zero, we add its value to our count
                cnt += freq.get(xor ^ x);
            }
            if (xor == x) { // if xor is same as number reqd, we will only increment count once, as
                            // xor^number will be zero
                cnt++;
            }
            if (freq.get(xor) != null) { // if xor has occured before, we will insert its value in hashamp along with
                                         // its previous freq+1
                freq.put(xor, freq.get(xor) + 1);
            } else
                freq.put(xor, 1); // if xor has not occured before, we will insert its value in hashamp along with
                                  // its freq as 1
        }
        return cnt;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int c = subarraysXor(a, x);
        System.out.println(c);
        scn.close();

    }
}
