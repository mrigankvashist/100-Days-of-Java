import java.util.Scanner;
  
  public class decimaltobase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
      scn.close();
   }
  
   public static int getValueInBase(int n, int b){
       int temp = 0;
       int rv = 0;
       int mult =1;

       while(n!=0){
           temp=n%b;
           n=n/b;
           rv += temp * mult;
           mult=mult*10;
       }
       return rv;
   }
  }