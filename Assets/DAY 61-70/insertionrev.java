import java.util.Scanner;

// T= O(N2)
public class insertionrev {
    public static int[] sortArray(int[] nums) {
        for(int i =1;i<nums.length;i++){  // first element is assumed to be sorted
            for(int j = i-1;j>=0;j--){  // j moves from one behind element of i till the 0th index
                if(nums[j]>nums[j+1]){ // checks of j with the next element, to be entered in the sorted numbers, which are fixed at the start of the array
                    int temp = nums[j]; //reverse bubble sort occurs, if new num is smaller, it will move to left
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
               else break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int[] res = sortArray(a);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        scn.close();

    }
}
