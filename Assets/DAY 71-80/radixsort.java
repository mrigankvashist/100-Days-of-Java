import java.util.Scanner;

public class radixsort {

    // T = O(bn) where b is the number of digits in the max number , S= O(N+B)

  public static void radixSort(int[] arr) {
    // write code here 
    int max = Integer.MIN_VALUE;  // assuming max value as a large -ve number
    for (int val : arr) {  // ranging a variable val over the array arr to find the maximum number
      if(val>max){  // if val is greater than max, we update max so as to find the largest number of array arr
        max = val;
      }
    }
    int exp = 1;  // exponent init as 1, this is used to access tens, hundreds, thousandth digit number
    while(exp<=max){  // e.g. if max number of array is 98, then the while loop will go on till exp is 10, i.e. 2 times. first 1, next 10
      countSort(arr,exp);  // count sort is called for that exponential number and for the entire array
      exp = exp * 10;  // exp is incremented for each iteration by 10 for each posi
    }

}
// same as count sort, only 2 differences 
// 1. max value is 9, min value is 0 since only a digit is passed into the sorting algorithm, therefore the range is 9-0+1 = 10
// 2. since each time a digit is considered in the count sort therefore instead of accesing array as arr[i], we access the digits as arr[i] / exp % 10 (eg. tens digit in 125 = 125 / 10 % 10 => 12 % 10 => 2)
  public static void countSort(int[] arr, int exp) {  
    int[] farr = new int[10];  // freq array init as range of max and min values of digits, 9-0+1
    for (int i = 0; i < arr.length; i++) {
      int pos = arr[i] / exp % 10;
      farr[pos]++; // freq array inc for each element of arr[i] digit
    }
    for (int i = 1; i < farr.length; i++) {
      farr[i]= farr[i] + farr[i-1];
    }
    int[] res = new int[arr.length];
    for(int i =arr.length-1;i>=0;i--){
      int val = arr[i];
      int pos = farr[ arr[i] / exp % 10];
      int idx = pos - 1;
      res[idx] = val;
      farr[arr[i]/exp % 10]--;
    }
    for(int i =0;i<arr.length;i++){
      arr[i] = res[i];
    }


    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    try (Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
  }

}
