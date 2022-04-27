import java.util.*;

public class quickselect {

  public static int quickSelect(int[] arr, int lo, int hi, int k) {  // to find the kth smallest element in the array => it would lie at k-1 th index
    int pivot = arr[hi];  // assiging pivot as the last element of the array
    int pi = partition(arr,pivot,lo,hi);  // finding the partiton index by passing the pivot in the partition function

    if(k>pi){  // if k is greater than the pivot index => the kth element lies to the right side of the pivot element, therefore quickselect algo is called to the right of the pivot i.e. pi+1 to hi
      return quickSelect(arr,pi+1,hi,k);
    }
    else if(k<pi){ // if k is smaller than the pivot index => the kth element lies to the left side of the pivot element, therefore quickselect algo is called to the left of the pivot i.e. lo to pi-1
      return quickSelect(arr,lo,pi-1,k);
    }
    else{
      return arr[pi]; // if k == pi, we will return the pivot or the arr at the pivot index
    }
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    System.out.println("pivot -> " + pivot);
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    System.out.println("pivot index -> " + (j - 1));
    return (j - 1);
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
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
        int k = scn.nextInt();
        System.out.println(quickSelect(arr,0,arr.length - 1,k - 1));
    }
  }

}