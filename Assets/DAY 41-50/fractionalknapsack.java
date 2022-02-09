import java.util.Arrays;
import java.util.Scanner;

public class fractionalknapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int[] wts = new int[n];
        for (int i = 0; i < wts.length; i++) {
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < items.length; i++) {
            double r = (arr[i] * 1.0) / wts[i];
            Item item = new Item(arr[i], wts[i], r);
            items[i] = item;

        }
        Arrays.sort(items);
        double vib = 0;
        int rc = cap;

        for (int i = items.length - 1; i >= 0; i--) {
            if (items[i].wt <= rc) {
                vib += items[i].val;
                rc -= items[i].wt;
            } else {
                vib += items[i].val * ((double) rc / items[i].wt);
                rc = 0;
                break;
            }

        }
        System.out.println(vib);

        scn.close();
    }

    public static class Item implements Comparable<Item> {
        int val;
        int wt;
        double r;

        Item(int val, int wt, double r) {
            this.val = val;
            this.wt = wt;
            this.r = r;
        }

        public int compareTo(Item o) {
            if(this.r>o.r){
                return 1;
            }
            else if(this.r<o.r){
                return -1;
            }
            else return 0;
        }

    }
}