import java.util.Scanner;

public class spiral {
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
        int sc = 0; // start col
        int sr = 0; // start row
        int ec = arr[0].length - 1; // end col
        int er = arr.length - 1; // end row
        int tne = r * c;
        int cnt = 0;

        while (cnt < tne) {
            for (int i = sr; i <= er && cnt<tne ; i++) {
                System.out.println(arr[i][sc]);
                cnt++;
            }
            sc++;
            for (int i = sc; i <= ec && cnt<tne; i++) {
                System.out.println(arr[er][i]);
                cnt++;

            }
            er--;
            for (int i = er; i >= sr && cnt<tne; i--) {
                System.out.println(arr[i][ec]);
                cnt++;

            }
            ec--;
            for (int i = ec; i >= sc && cnt<tne; i--) {
                System.out.println(arr[sr][i]);
                cnt++;

            }
            sr++;
        }

        scn.close();

    }
}