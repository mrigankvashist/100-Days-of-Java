import java.util.Scanner;
import java.util.ArrayList;

public class getkpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
        scn.close();
    }

    static String[] codes = {".;","abc","def","ghi","jki","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        //678
        char ch = str.charAt(0); //6
        String ros = str.substring(1); //78

        ArrayList<String> rres = getKPC(ros); // 6 of 78
        ArrayList<String> mres = new ArrayList<>(); //24 of 78

        String codeforch = codes[ch-'0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char chcode = codeforch.charAt(i);
            for(String rstr : rres){
                mres.add(chcode+rstr);
            }
        }

        return mres;

        
    }
    
}
