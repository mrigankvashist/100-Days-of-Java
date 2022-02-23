import java.util.Scanner;

public class romantoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String S = scn.nextLine();
        int ans = 0, num = 0;
        for (int i = S.length()-1; i >= 0; i--) {
            switch(S.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        System.out.println(ans);
        scn.close();


        
    }
    
}
