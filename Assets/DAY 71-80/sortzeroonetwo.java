import java.util.Scanner;

public class sortzeroonetwo {

  public static void sort012(int[] arr) {
    // write your code here

    // 0 -> j-1 = area with value as 0
    // j -> i-1 = area with value as 1
    // i -> k-1 = area with value as 2

    // i and j pointer start from zero, i traverses through the array. K pointer starts from end and traverses backward, fixes all indexes with value as 2
    int k = arr.length - 1;
    int j = 0;
    int i = 0;
    while (i <= k) {     //loop ends as i pointer crosses k pointer, since no element would be unknown then
      if (arr[i] == 0) {  // if value is zero, we swap the i pointer(which is ahead) and j pointer(which is behind) so that the 0 value ahead can be brought behind
        swap(arr, i, j);
        i++;  // both pointers are incremented
        j++;
      } else if (arr[i] == 1) {  // value 1 would remain unchanged since it lies between j to i-1
        i++;
      } else { // if value is 2, i pointer(which is behind) and k pointer (which is at the end ) would be swapped so that 2 can be brought at end and its index is fixed
        swap(arr, i, k);  
        k--;// decresing k index
      }
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
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
      for (int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
      }
      sort012(arr);
      print(arr);
    }
  }

}