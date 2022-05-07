import java.util.Scanner;

public class sortzerone {
    // T = O(N)

  public static void sort01(int[] arr){
    //write your code here
    int i =0,j=0;
    // if a[i] is 1 , we keep incrementing the i pointer
    // if a[i] = 0, we want this 0 at the left side, therefore we swap the value at a[i] with value at a[j](which lies on the left) and increment both pointers 
    while(i<arr.length && j < arr.length) { 
        if(arr[i] == 1){
            i++;
        }
        else{
            swap(arr, i, j);
            i++;
            j++;
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

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args)  {
    try (Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
          arr[i] = scn.nextInt();
        }
        sort01(arr);
        print(arr);
    }
  }

}
