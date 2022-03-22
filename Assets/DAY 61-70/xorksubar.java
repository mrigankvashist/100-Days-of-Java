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

import java.io.HashMap;
public class xorksub {
    public int solve(int[] A, int B) {
     HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>(); 
        int c = 0; 
        int cpx = 0;
        int n = A.length;
        for(int i = 0;i<n;i++) {
            cpx = cpx ^ A[i]; 
            if(visited.get(cpx^B) != null) 
                c += visited.get(cpx ^ B); 
            if(cpx == B) {
                c++; 
            }
            if(visited.get(cpx) != null) 
                visited.put(cpx, visited.get(cpx) + 1); 
            else 
                visited.put(cpx, 1); 
        }
        return c; 
    }
}

public class sol {
	public static void main (String[] args) {
		Solution obj = new Solution();
		int[] A = new int[]{4,2,2,6,4};
		int countTotal=obj.solve(A,6);
		System.out.println("The total number of subarrays having a given XOR k is "+countTotal);
	}
}
