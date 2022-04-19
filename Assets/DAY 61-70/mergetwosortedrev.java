import java.util.Scanner;

// T= O(N)
public class mergetwosortedrev {
    public static int[] mergetwosortArray(int[] num1,int[] num2) {
        int[] res = new int[num1.length + num2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<num1.length && j<num2.length){
            if(num1[i]<num2[j]){
                res[k] = num1[i];
                k++;
                i++;
            }
            else{
                res[k] = num2[j];
                j++;
                k++;
            }
        }
        while(i<num1.length){
            res[k] = num1[i];
            i++;
            k++;
        }
        while(j<num2.length){
            res[k] = num2[j];
            k++;
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = scn.nextInt();
        }
        int[] res = mergetwosortArray(a,b);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        scn.close();

    }
}

