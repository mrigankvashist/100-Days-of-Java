import java.util.Scanner;

public class countsort {
    // used for values within a shorter range

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int range = max - min + 1;
   int[] freqarr = new int[range]; // for calc freq of each element
   for(int i =0;i<arr.length;i++){
       int idx = arr[i] - min;  // eg. if values are 3 to 9 (3,4,5,6,7,8,9) then idx for 9 would be 9-min=> 9-3 = 6 in the freq array(last index of freq array of length 9-3+1)
       freqarr[idx]++;
   }

   // prefix sum array --> for sorting algo stability . In a stable sort, if 2 values are same numerically, then the preceeding value would be the one that is original lying before, for example the previous roll number would be written before, or the name starting lexographically ahead
   for(int i =1;i<freqarr.length;i++){
       freqarr[i] = freqarr[i] + freqarr[i-1];  // prefix sum array is calc by adding the prev values of the array to the current val
   }
   int[] res = new int[arr.length];  // resultant array
   for(int i =arr.length-1;i>=0;i--){  // reverse loop since resultant array is filled from the last spot 
       int val = arr[i];  // last value is taken as val for example the value is 9
       int pos = freqarr[val-min];  // position is found from the prefix sum array by freqarr[9-min]=> freqarr[9-3] = freqarr[6]. whatever value is already present at freqarr[6] spot is sent as index 
       int idx = pos-1;  // one is subtracted to form it as the index
       res[idx] = val;  // value is dumped in the resultant index 
       freqarr[val-min]--;  // the freqarr index used is subtracted
   }
   for (int i = 0; i < res.length; i++) {
       arr[i] = res[i];  // copied the res to og array
   }
   

   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    try (Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
          max = Math.max(max, arr[i]);
          min = Math.min(min, arr[i]);
        }
        countSort(arr,min,max);
        print(arr);
    }
  }

}
