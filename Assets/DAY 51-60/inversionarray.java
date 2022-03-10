import java.util.Scanner;

public class inversionarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        merge(a,0,n-1);
        System.out.println(count);
        scn.close();
    }
    static int count = 0;

    public static int[] merge(int[] a, int lo, int hi){
        if(lo == hi){
            int[] bres = new int[1];
            bres[0] = a[lo];
            return bres;
        }
        int mid = (lo+hi)/2;
        int[] left = merge(a,lo,mid);
        int[] right = merge(a,mid+1,hi);
        int[] merged = mergesortedar(left,right);
        return merged;

    }

    public static int[] mergesortedar(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] merge = new int[left.length + right.length];
        while(i<left.length && j<right.length ){
            if(left[i]<=right[j]){
                merge[k] = left[i];
                k++;
                i++;
            }
            else{
                count += (left.length-i);
                merge[k] = right[j];
                k++;
                j++;
            }
        }

        while(i<left.length){
            merge[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            merge[k] = right[j];
            j++;
            k++;
        }
        return merge;
    }
    
}
