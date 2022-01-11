import java.util.Scanner;

public class introstrings {
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        // String s1 = scn.next();
        // String s2 = scn.next();
        // String s1 = scn.nextLine();
        // String s2 = scn.nextLine();
        // String s1 ="hello";
        // System.out.println(s1);
        // System.out.println(s2);

        // String s = scn.nextLine();
        // System.out.println(s);
        // System.out.println(s.length()); // length is a fn

        // char ch = s.charAt(2);
        // System.out.println(ch);

        // for (int i = 0; i < s.length(); i++) {
        //         ch = s.charAt(i);
        //         System.out.println(ch);
        // }
        // String s = "abcdef";
        // System.out.println(s.substring(1,3));
        // System.out.println(s.substring(1));

        //All substrings-->
        // String s = "abcd";
        // for(int i =0;i<s.length();i++){
        //     for(int j =i+1;j<=s.length();j++){
        //         System.out.println(s.substring(i, j));
        //     }
        // }

        // String s1 = "hello";
        // String s2 = "world";
        // System.out.println(s1+" " + s2);

        String s = "abc def ghi jkl mno";
        String[] parts = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }




        scn.close();

        
    }
    
}
