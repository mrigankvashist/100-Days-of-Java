import java.util.Scanner;
public class reverseanarray {
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int temp = 0;
        int j = arr.length-1;
        int i = 0;
        while(j>i){ 
        temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
        for(int p=0;p<n;p++){
            System.out.print(arr[p]) ;
        }
        scn.close();
        
        
    }
    
}
