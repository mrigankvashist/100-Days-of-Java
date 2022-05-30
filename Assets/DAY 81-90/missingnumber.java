import java.util.Scanner;
public class missingnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = scn.nextInt();
        }
        System.out.println(missingNumber(a));
        scn.close();
    }
    public static int missingNumber(int[] nums) {
        int a = 0;
        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int i =0;i<n;i++){
            a+=nums[i];
        }
        int r = sum - a;
        return r;
    }
}
