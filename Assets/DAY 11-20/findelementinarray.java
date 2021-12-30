import java.util.Scanner;

public class findelementinarray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter number to search");
        int d = scn.nextInt();
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (d == arr[i]) {
                idx = i+1;
                break;
            }
        }
        System.out.println(idx);
        scn.close();
        }
    }


