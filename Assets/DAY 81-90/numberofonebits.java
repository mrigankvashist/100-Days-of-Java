import java.util.Scanner;
public class numberofonebits{ // Kernighan algorithm
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cnt = 0;
        while(n!=0){
            n &= (n-1);  // complement of num and num-1, After applying &(bitwise AND) operator on n and n - 1 i.e. (n & n - 1), the righmost set bit will be turned off/toggled/flipped. iteration carry on till num is 0
            cnt++;
        }
        System.out.println(cnt);
        scn.close();
        
    }
}
