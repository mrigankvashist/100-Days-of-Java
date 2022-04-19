import java.util.Scanner;

// T= O(N2)
public class selectionrev {
    public static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {  // n-1 total iterations
            int mi = i;  // min index assigned at the first index
            for (int j = i + 1; j < nums.length; j++) { // j starts from the next index of i always, goes till the last index
                if (nums[j] < nums[mi]) { // j is compared with the min index, and min is updated if it finds a lower val
                    mi = j;
                }
            }
            int temp = nums[mi];  // min is swapped with the first node so as to fix the smallest element at the first place
            nums[mi] = nums[i];
            nums[i] = temp;
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
