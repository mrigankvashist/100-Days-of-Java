import java.util.Scanner;
// T= O(N2)
public class bubblerev {
    public static int[] sortArray(int[] nums) {
        for(int itr =1;itr<=nums.length-1;itr++){  // starting from 1 till size-1 iterations, since each loop is comparing till element before last place and swapping it
            for(int i =0;i<nums.length - itr;i++){ // iteration nested loop --> for each iteration it runs till size - number of itr, because last digits are fixed(greatest digits)
                if(nums[i]>nums[i+1]){ // swapping if next element is smaller
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
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
