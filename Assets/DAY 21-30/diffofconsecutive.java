import java.util.Scanner;

public class diffofconsecutive {
    public static String diff(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            int gap = curr - prev;

            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(diff(s));
        scn.close();
    }
}