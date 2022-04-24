import java.util.Scanner;

public class quicksortrev {
    public static void quicks(int[] nums,  int lo, int hi) {
        if(lo>hi){
            return;
        }
        int pivot = nums[hi];
        int pi = partition(nums, pivot, lo, hi);
        quicks(nums, lo, pi-1);
        quicks(nums, pi+1, hi);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int partition(int[] nums, int pivot, int lo, int hi) {
        int i = lo;
        int j = lo;
        while (i < nums.length) {
            if (nums[i] > pivot) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        return j-1;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        quicks(a, 0, a.length - 1);
        scn.close();
    }
}
