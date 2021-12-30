import java.util.*;

public class anybasemultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
    scn.close();
 }
 public static int getProduct(int b, int n1, int n2){
    int mult = 1;
    int rv = 0;
    while(n2>0){
    int d2 = n2%10;
    n2 = n2/10;
    int sprd = getProductWithSingleDigit(b, n1, d2);
    rv = getSum(b, rv, sprd*mult);
    mult = mult * 10;
    }
    return rv;
}

 public static int getProductWithSingleDigit(int b, int n1, int d2){
     int rv = 0;
     int c = 0;
     int mult = 1;
    while(n1!=0 || c!=0){
        int d1 = n1 % 10;
        n1 = n1/10;
        int d = d1 * d2 +c;
        d = d % b;
        c = d / b;
        rv += d * mult;
        mult = mult * 10;
    }
    return rv;
}
 public static int getSum(int b, int n1, int n2) {
     int mult = 1;
     int rv =0;
     int c = 0;
     while( n1 !=0 || n2 !=0 || c!=0){
         int d1 = n1%10;
         int d2 = n2%10;
         n1 = n1/10;
         n2 = n2/10;
         int d = d1 + d2 + c;
         d = d % b;
         c = d / b;
         rv += d*mult;
         mult = mult * 10;
     }
     return rv;    
 }

}
