import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval {
    static int[][] merge(int[][] intervals) {
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

    static int[][] insert(int[][] intervals, int[] newInterval) {
        boolean isInserted = false;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (!isInserted && intervals[i][0] > newInterval[0]) {
                // list.add( newInterval );
                list.add(new ArrayList<>(Arrays.asList(newInterval[0], newInterval[1])));
                isInserted = true;
            }
            list.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][1])));
        }
        if (!isInserted) {
            list.add(new ArrayList<>(Arrays.asList(newInterval[0], newInterval[1])));
        }

        int rows = list.size();
        int cols = list.get(0).size();

        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = list.get(i).get(j);
            }
        }
        return merge(ans);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
        int[] newInterval = { 4, 8 };
        int[][] ans = insert(intervals, newInterval);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
