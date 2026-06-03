// https://www.geeksforgeeks.org/problems/count-frequency-of-an-element-in-a-given-range/1

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    // Optimized code
    static int lowerBound(List<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int upperBound(List<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static ArrayList<Integer> freqInRangeOptimized(int[] arr, int[][] queries) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int x = queries[i][2];

            List<Integer> list = map.get(x);
            if (list == null) {
                result.add(0);
            } else {
                int left = lowerBound(list, l);
                int right = upperBound(list, r);

                result.add(right - left);
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 1, 2, 3 };
        int[][] queries = { { 0, 4, 1 }, { 2, 5, 2 }, { 1, 6, 3 }, { 0, 6, 5 } };
        System.out.println(freqInRangeOptimized(arr, queries));
    }
}
