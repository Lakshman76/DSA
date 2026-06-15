// https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1

import java.util.Arrays;
import java.util.List;

public class ExitPointInMatrix {
    static List<Integer> exitPoint(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        int dir = 0;
        while (true) {
            dir = (dir + mat[row][col]) % 4;

            mat[row][col] = 0;

            if (dir == 0) {
                col++;
            } else if (dir == 1) {
                row++;
            } else if (dir == 2) {
                col--;
            } else {
                row--;
            }

            if (row < 0)
                return Arrays.asList(row + 1, col);
            if (row >= m)
                return Arrays.asList(row - 1, col);
            if (col < 0)
                return Arrays.asList(row, col + 1);
            if (col >= n)
                return Arrays.asList(row, col - 1);
        }

    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 0 } };
        System.out.println(exitPoint(mat));
    }
}
