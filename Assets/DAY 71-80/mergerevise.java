import java.util.Scanner;

// T= O(NLogN)
public class mergerevise {
    public static int[] mergesortop(int[] a, int lo, int hi) {
        if(lo == hi){  // base case for recursion in which only 1 element is left in the array
            int[] bres = new int[1];
            bres[0] = a[lo];  // inserting last element in blank array and returining
            return bres;
        }
        int mid = (lo+hi)/2;  // virtual mid for each recursion
        int[] fhs = mergesortop(a, lo, mid); // first half sorted array found recursively, low to mid
        int[] shs = mergesortop(a, mid+1, hi); // second half sorted array found recursively, mid+1 to high
        int[] merge = mergesortarr(fhs, shs);  // both sorted arrays are merged
        return merge;
    }  

    //merge two sorted arrays
    public static int[]  mergesortarr(int[] a, int[] b) {
        int[] res = new int[a.length+b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<a.length && j <b.length){
            if(a[i]<b[j]){
                res[k] = a[i];
                k++;
                i++;
            }
            else{
                res[k] = b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            res[k] = a[i];
            k++;
            i++;
        }
        while(j<b.length){
            res[k] = b[j];
            k++;
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int[] res = mergesortop(a,0,a.length-1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        scn.close();

    }
}
