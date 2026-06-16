// https://www.geeksforgeeks.org/problems/construct-list-using-given-q-xor-queries/1

import java.util.ArrayList;
import java.util.Comparator;

public class ConstructListXOR {
    static void findXOR(ArrayList<Integer> list, int x) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) ^ x));
        }
    }

    static ArrayList<Integer> constructList(int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i][0];
            int x = queries[i][1];
            if (query == 1) {
                findXOR(list, x);
            } else {
                list.add(x);
            }
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }

    static ArrayList<Integer> constructListOptimized(int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        int xor = 0;
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i][0];
            int x = queries[i][1];
            if (query == 1) {
                xor ^= x;
            } else {
                list.add(xor ^ x);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) ^ xor));
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public static void main(String[] args) {
        int[][] queries = { { 0, 6 }, { 0, 3 }, { 0, 2 }, { 1, 4 }, { 1, 5 } };
        System.out.println(constructListOptimized(queries));
    }
}
