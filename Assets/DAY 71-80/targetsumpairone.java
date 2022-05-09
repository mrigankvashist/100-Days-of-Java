import java.util.Scanner;
import java.util.Arrays;

public class targetsumpairone {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    int i = 0; //left index
    int j = arr.length -1; // right index
    Arrays.sort(arr);
    while(i<j){  // till left index does not cross the right index
        if(arr[i]+arr[j]>target){
            j--; // if value is greater than reqd, so we will decrease the higher value (j) since the array is in ascending order. If we increase i we will get a higher sum
        }
        else if(arr[i]+arr[j]<target){
            i++; // if value is less than reqd, so we will increase the lower value (i) since the array is in ascending order. If we decrease j we will get a smaller sum
        }
        else{
            System.out.println(arr[i]+ ", "+arr[j]);
            i++;
            j--;
        }
    }

  }
  public static void main(String[] args) throws Exception {
    try (Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
          arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair(arr,target);
    }
  }

}
    

