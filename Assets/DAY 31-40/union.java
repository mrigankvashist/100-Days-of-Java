import java.util.Scanner;
import java.util.ArrayList;

public class union {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] > arr2[j]) {
                if (list.size() > 0 && list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                } else if (list.size() == 0) {
                    list.add(arr2[j]);
                }
                j++;

            } else if (arr2[j] > arr1[i]) {
                if (list.size() > 0 && list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                } else if (list.size() == 0) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if (list.size() > 0 && list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);

                } else if (list.size() == 0) {
                    list.add(arr2[j]);
                }
                j++;
                i++;
            }

        }

        while (i < arr1.length) {
            if (list.size() > 0 && list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (list.size() > 0 && list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        for (

        int val : list) {
            System.out.println(val);
        }

        scn.close();
    }

}