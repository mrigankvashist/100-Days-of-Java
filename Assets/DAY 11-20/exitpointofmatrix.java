import java.util.Scanner;

public class exitpointofmatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int dir = 0; // 0-E, 1- S, 2- W, 3- N (Directions)
        int i = 0;
        int j = 0;
        while (true) {
            dir = (dir + arr[i][j]) % 4;

            if (dir == 0) { // East
                j++;
            }
            if (dir == 1) { // South
                i++;
            }
            if (dir == 2) { // West
                j--;
            }
            if (dir == 3) { // North
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
        scn.close();

    }

}
