// https://www.geeksforgeeks.org/problems/count-frequency-of-an-element-in-a-given-range/1

import java.util.ArrayList;

public class FreqencyInRange {
    static ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int x = queries[i][2];
            int count = 0;
            for (int j = l; j <= r; j++) {
                if (arr[j] == x)
                    count++;
            }
            result.add(count);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 21, 51, 101, 11, 51 };
        int[][] queries = { { 0, 4, 11 }, { 2, 5, 51 } };
        System.out.println(freqInRange(arr, queries));
    }
}
