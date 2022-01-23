import java.util.Scanner;

public class lastindex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int l = lastin(0,d,arr);
        System.out.println(l);
        scn.close();
    }

    public static int lastin(int idx, int d,int[] arr) {
        if(idx == arr.length){
            return -1;
        }
        int l = lastin(idx+1, d, arr);
        if(l==-1){
            if(arr[idx] == d){
                return idx;
            }
            else return -1;
        }
        else return l;  
    }
}
