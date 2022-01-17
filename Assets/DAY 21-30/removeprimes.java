import java.util.ArrayList;
import java.util.Scanner;

public class removeprimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }
        for (int i = list.size()-1; i >= 0; i--) {
            int val = list.get(i);
            for (int j = 2; j * j < val; j++) {

                if(val%j!=0) {
                    list.remove(i);
                }
            }
        }
            System.out.println(list);
        scn.close();

    }

}
