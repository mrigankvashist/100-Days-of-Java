import java.util.Scanner;

public class reversearrstr {
    //+++++++++++ ITERATION+++++++++++++++
    // public static void rev(int n, int[] arr) {
    // int start = 0;
    // int end = n-1;
    // while(start<end){
    // int temp = arr[start];
    // arr[start]= arr[end];
    // arr[end]=temp;
    // start++;
    // end--;
    // }
    // }

    // ++++++++++ STRING +++++++++++++++

    // public static String reverseWord(String str)
    // {
    //     // Reverse the string str
    //     String nstr="";
    //     for(int i=0;i<str.length();i++){
    //         char ch = str.charAt(i);
    //         nstr = ch + nstr;
            
    //     }
    //     return nstr;
    // }

    //+++++++++++  RECURSIVE ++++++++++

    public static void rev(int idx, int[] arr) {
        if (idx == arr.length) {
            return;
        }
        rev(idx + 1, arr);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        rev(0, arr);
        scn.close();
    }

}
