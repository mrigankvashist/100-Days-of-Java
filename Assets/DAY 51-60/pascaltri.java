import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascaltri {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rlen = scn.nextInt();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> rows, pre = null;
        for (int i = 0; i < rlen; i++) {
            rows = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    rows.add(1);
                } else {
                    rows.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = rows;
            res.add(rows);
        }
        for (List<Integer> val : res) {
            System.out.println(val);
        }
        scn.close();
    }

}
