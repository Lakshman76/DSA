// https://www.geeksforgeeks.org/problems/overlapping-intervals--174556/1

import java.util.Arrays;

public class OverlappingIntervals {
    static boolean isIntersect(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int end1 = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if (end1 >= start2) {
                return true;
            }
            end1 = end2;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 4, 5 }, { 6, 9 }, { 1, 3 }, { 12, 14 } };
        System.out.println(isIntersect(intervals));
    }
}
