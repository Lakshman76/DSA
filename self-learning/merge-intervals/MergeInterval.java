// 56. Merge Intervals

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (end1 >= intervals[i][0]) {
                end1 = Math.max(end1, intervals[i][1]);
                continue;
            }
            list.add(new ArrayList<>(Arrays.asList(start1, end1)));
            start1 = intervals[i][0];
            end1 = intervals[i][1];
        }
        list.add(new ArrayList<>(Arrays.asList(start1, end1)));

        int rows = list.size();
        int cols = list.get(0).size();

        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = list.get(i).get(j);
            }
        }
        return ans;
    }

    static int[][] mergeOptimised(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (end1 >= intervals[i][0]) {
                end1 = Math.max(end1, intervals[i][1]);
                continue;
            }
            list.add(new int[] { start1, end1 });
            start1 = intervals[i][0];
            end1 = intervals[i][1];
        }
        list.add(new int[] { start1, end1 });

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] ans = merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
