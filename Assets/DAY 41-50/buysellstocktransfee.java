import java.util.Scanner;

public class buysellstocktransfee {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int fee = scn.nextInt();

        int obsp = -a[0];
        int ossp = 0;
        for (int i = 1; i < n; i++) {
            int nbsp = 0;
            int nssp = 0;

            if(ossp-a[i]> obsp){
                nbsp = ossp-a[i];
            }
            else{
                nbsp = obsp;
            }
            if(obsp+a[i] - fee >ossp){
                nssp = obsp+a[i] - fee;
            }
            else{
                nssp = ossp;
            }
            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
        scn.close();

    }
}