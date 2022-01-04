import java.util.Scanner;
public class brokeneconomy{
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int low = 0;
        int ceil=0;
        int floor=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(n>arr[mid]){
                floor = arr[mid];
                low = mid+1;
            }
            else if(n<arr[mid]){
                ceil = arr[mid];
                high = mid -1;
            }
            else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
        scn.close();
         

        }
        
    }
