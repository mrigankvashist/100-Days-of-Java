import java.util.Scanner;

public class anybasetoanybase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int anybase = getval(n, sourceBase, destBase);
        System.out.println(
                "number " + n + " in base " + sourceBase + " when converted to base " + destBase + " is =  " + anybase);
        scn.close();
    }
    public static int getval(int n, int src, int dest) {
        int decimal = anytodeci(n, src);
        int result = decitoany(decimal, src, dest);
        return result;
    }
    public static int decitoany(int n, int src, int dest) {
        int conv=0;
        if(dest==10){
            return n;
        }
        else{
        int mult = 1;
        int temp = 0;
        while(n!=0){
            temp = n % dest;
            n = n / dest;
            conv += temp * mult;
            mult = mult * 10;
        }
        }
        return conv;
    }
    public static int anytodeci(int n, int src) {
        int conv = 0;
        int mult = 1;
        int temp = 0;
        while (n != 0) {
            temp = n % 10;
            n = n / 10;
            conv += temp * mult;
            mult = mult * src;
        }
        return conv;
    }
}
