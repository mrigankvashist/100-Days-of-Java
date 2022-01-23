import java.util.Scanner;

public class allindex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int[] l = allin(arr,d,0,0);
        for (int i = 0; i < l.length; i++) {
            System.out.println(l[i]);
        }
        scn.close();
    }


    public static int[] allin(int[] arr,int d, int idx,int fsf) {
        if(idx==arr.length){
            return new int[fsf];
        }
        if(arr[idx]==d){
            int[] iarr= allin(arr, d, idx+1, fsf+1);
            iarr[fsf] = idx;
            return iarr;
        }
        else{
            int[] iarr= allin(arr, d, idx+1, fsf);
            return iarr;
        }
    }
}
