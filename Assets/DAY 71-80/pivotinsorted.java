import java.util.Scanner;

public class pivotinsorted {

  public static int findPivot(int[] arr) {
    // similar to binary search
    int lo = 0 ;  // assigninf low and high
    int hi = arr.length - 1;
    while(lo<hi){  // loop will go on till lo<hi means till lo== hi i.e. the partition element
        int mid = (lo+hi)/2; // finding mid repeatedly
        if(arr[mid]>arr[hi]){  // if mid is greater than hi element, it means the value is decreasing from mid till higher element i.e. pivot lies in the right half since the value of pivot is lowest and array is sorted
            lo = mid + 1; // therfore lo would be upgraded for the right half
        }
        else{ // else if mid is less than hi element, it means the value is increasing from mid till higher element i.e. pivot lies in the left half since the value of pivot is lowest and array is sorted
            hi = mid; // therefore hi is upgraded to mid value
        }
    }
    return arr[hi]; // we can return either lo or hi since both are same after while loop
  }
  // TIME COMPLEXITY: length of array is half every time. We divide the array every time we halve it, and the log is nothing more than repeated division. As a result, the number of times an array of length n can be divided is logn. So the time complexity is O. (logn).


  //For time complexity O(N)
  public static int findPivot2(int[] arr) {
    for(int i =1;i<arr.length;i++){
      if(arr[i]<arr[i-1]){  // if value of next element is less than prev in sorted i.e. that is the pivot element
        return arr[i];
      }
    }
    return 0;
  }


  public static void main(String[] args) throws Exception {
    try(Scanner scn = new Scanner(System.in)){
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);
  
}
  }

}
