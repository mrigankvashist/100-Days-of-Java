import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = scn.nextInt();
            }
            //extra space O(N)
            // int j = 0;
            // int k = 1;
            // int[] ans = new int[n];
            // for (int i = 0; i < a.length; i++) {
            //     if(a[i]%2==0){
            //         ans[j] = a[i];
            //         j+=2;
            //     }
            //     if(a[i]%2==1){
            //         ans[k] = a[i];
            //         k+=2;
            //     }
            // }
            // for (int i = 0; i < n; i++) {
            //     a[i] = ans[i];
            // }

            //without extra space
            int even = 0;
            int odd = 1;
            while(true){
                while(even<n  && a[even]%2==0){
                    even +=2;
                }
                while(odd<n && a[odd]%2 == 1){
                    odd += 2;
                }
                if(odd>=n || even >=n){
                    break;
                }
                else{
                    int temp = a[even];
                    a[even] = a[odd];
                    a[odd] = temp;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }

    }
        
    }
    }