import java.util.Scanner;

public class wavetraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }

        for (int j = 0; j < arr1[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr1.length; i++) {
                    System.out.println(arr1[i][j]);
                }
            } else {
                for (int i = arr1.length - 1; i >= 0; i--) {
                    System.out.println(arr1[i][j]);
                }
            }
        }
        scn.close();
    }

}
