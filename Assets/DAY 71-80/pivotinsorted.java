import java.util.Scanner;

public class pivotinsorted {

  public static int findPivot(int[] arr) {
    // write your code here
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
