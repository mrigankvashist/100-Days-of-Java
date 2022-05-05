import java.util.Scanner;
public class sortdates {
  public static void sortDates(String[] arr) {
    // write your code here
    countSort(arr,1000000,100,32);
    countSort(arr,100000,100,13);
    countSort(arr,1,100000,2501);
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    // write your code here
    String[] ans = new String[arr.length];
     int[] farr = new int[range];  // freq array init as range of max and min values of digits, 9-0+1
    for (int i = 0; i < arr.length; i++) {
      farr[Integer.parseInt(arr[i],10) / div % mod]++; // freq array inc for each element of arr[i] digit
    }
    for (int i = 1; i < farr.length; i++) {
      farr[i]+=farr[i-1];
    }
    for(int i =arr.length-1;i>=0;i--){
      int pos = farr[ Integer.parseInt(arr[i],10) / div % mod] -1 ;
      ans[pos] =  arr[i];
      farr[Integer.parseInt(arr[i],10) / div % mod]--;
    }
    for(int i =0;i<arr.length;i++){
      arr[i] = ans[i];
    }
   
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    try (Scanner scn = new Scanner(System.in)) {
      int n = scn.nextInt();
      String[] arr = new String[n];
      for (int i = 0; i < n; i++) {
        String str = scn.next();
        arr[i] = str;
      }
      sortDates(arr);
      print(arr);
    }
  }

}