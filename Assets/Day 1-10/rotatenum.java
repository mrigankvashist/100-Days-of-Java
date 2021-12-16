import java.util.Scanner;

public class rotatenum {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();       
       int k = scn.nextInt();       
       int temp = n;
       int num_dig=0;
       while(temp!=0){
           temp=temp/10;
           num_dig++;
       }
       k = k%num_dig;
       if(k<0){
           k=k+num_dig;
       }
       int div=1;
       int mult=1;
       for(int i=1;i<=num_dig;i++){
           if(i<=k){
               div = div*10;
           }
           else 
           mult=mult*10;
       }
       int quot = n/div;
       int rem = n%div;
       int rotated_num = rem*mult + quot;
       System.out.println(rotated_num);
       scn.close();

    }
}
