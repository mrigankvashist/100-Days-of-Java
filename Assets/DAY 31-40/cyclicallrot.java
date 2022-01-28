import java.util.Scanner;

public class cyclicallrot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int x = arr1[arr1.length-1];
        for (int i = arr1.length-1; i > 0; i--) {
            arr1[i]=arr1[i-1];
        }
        arr1[0]=x;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }



        
        scn.close();
    }

}
