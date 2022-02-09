import java.util.Scanner;

public class countbinarystring {
    public static void main(String[] args) {
        
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int oldzero = 1;
            int oldone = 1;
            
            
            for (int i = 2; i <= n; i++) {
                int newzero = oldone;
                int newone = oldone + oldzero;

                oldone = newone;
                oldzero = newzero;
            }
            System.out.println(oldone+oldzero);
            scn.nextInt();
        }
        
        
    }
}
