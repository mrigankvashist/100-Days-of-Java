import java.util.Scanner;

public class rotatearray {
    public static void reverse(int[] arr, int i,int j){
        int temp = 0;
        while(j>=i){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }    
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        if(r>=n){
            r=r%n;
        }
        if (r < 0) {
            r = r + n;
        }
        reverse(arr, 0, n-r-1);
        reverse(arr, n-r, n-1);
        reverse(arr, 0, n-1);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        

        
        scn.close();
    }
}