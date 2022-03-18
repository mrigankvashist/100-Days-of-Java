import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twosumop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }
        int[] res = twoSum(nums, t);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        scn.close();

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;

    }
}
