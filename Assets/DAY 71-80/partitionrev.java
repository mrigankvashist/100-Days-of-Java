import java.util.Scanner;

// T= O(N2)
public class partitionrev {
    public static int[] partition(int[] nums, int pivot) {
        int i = 0;
        int j = 0;
        while(i<nums.length){
            if(nums[i]>pivot){  // if number is greater than pivot, we only increment the i pointer
                i++;
            }
            else{
                int temp = nums[i];  // if number is less than pivot, we only swap that lesser number at ith spot with the jth element (which lies at the left of ith element) so that all lesser elements can be on the left of the pivot
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
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
        int pivot = scn.nextInt();

        int[] res = partition(a,pivot);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        scn.close();

    }
}
