import java.util.Scanner;

public class nextpermut {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        if(a==null || a.length<=1){
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
        int i = a.length-2;
        while(i>=0 && a[i]>=a[i+1]){
            i--;
        }
        if(i>=0){
            int j = a.length-1;
            while(a[j]<=a[i]){
                j--;
            }
            swap(a, i, j);
            
        }
        rev(a, i+1, a.length-1);
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x]);
        }
        
        scn.close();
    }
        public static void swap(int[] a,int i,int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp; 
        }
        public static void rev(int[] a,int i,int j) {
            while(i<j){
                swap(a, i++, j--);
            }
        }

}
