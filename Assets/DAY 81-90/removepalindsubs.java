
public class removepalindsubs {
    public static void main(String[] args) {
        String s = "abba";
        if (isPalindrome(s)) {
            System.out.println(1);
        } else
            System.out.println(2);
    }

    private static boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        while (i < n / 2) {
            if (s.charAt(i) != s.charAt(n - 1 - i++)) {
                return false;
            }
        }
        return true;

    }

}
