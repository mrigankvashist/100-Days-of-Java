import java.util.ArrayList;
import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ss = scn.next();
        ArrayList<String> res = gss(ss);
        System.out.println(res);  
        scn.close();
    }
    public static ArrayList<String> gss(String ss) {
        if(ss.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;

        }
        char ch = ss.charAt(0);
        String ros = ss.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr : rres){
            mres.add(""+ rstr);
            mres.add(ch+ rstr);
        }
        return mres;


        
    }
    
}
