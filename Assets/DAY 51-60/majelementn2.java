import java.util.Scanner;

public class majelementn2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int res = majorityElement(a);
        System.out.println(res);
        scn.close();
        
    }
    public static int majorityElement(int[] nums) {
        int e = 0 ;
        int cnt = 0;
        for(int i =0;i<nums.length;i++){
            if(cnt == 0){
                e = nums[i];
            }
            if(e == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return e;
        
    }
}
