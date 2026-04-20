
// 986. Interval List Intersections
import java.util.ArrayList;

public class IntervalIntersection {

    static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {
            int start1 = firstList[i][0];
            int end1 = firstList[i][1];

            int start2 = secondList[j][0];
            int end2 = secondList[j][1];
            // overlap condition
            if (start1 <= start2) {
                if (end1 >= start2) {
                    int start = Math.max(firstList[i][0], secondList[j][0]);
                    int end = Math.min(firstList[i][1], secondList[j][1]);
                    result.add(new int[] { start, end });
                }
            } else {
                if (end2 >= start1) {
                    int start = Math.max(firstList[i][0], secondList[j][0]);
                    int end = Math.min(firstList[i][1], secondList[j][1]);
                    result.add(new int[] { start, end });
                }
            }
            // Move pointer
            if (end1 < end2) {
                i++;
            } else {
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] firstList = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
        int[][] secondList = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
        int[][] ans = intervalIntersection(firstList, secondList);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
