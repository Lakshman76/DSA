import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int data;
    int row;
    int col;

    Pair(int data, int row, int col) {
        this.data = data;
        this.row = row;
        this.col = col;
    }

    public int compareTo(Pair other) {
        return this.data - other.data;
    }
}

public class KthSmallestInMatrix {

    static int kthSmallest(int[][] mat, int k) {

        // Create min-heap in O(n)
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            Pair p = new Pair(mat[i][0], i, 0);
            list.add(p);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(list);

        // main khela
        int ans = -1;
        int count = 0;
        while (count < k) {
            Pair top = pq.poll();
            ans = top.data;
            int row = top.row;
            int col = top.col;

            if (col + 1 < mat[0].length) {
                Pair p = new Pair(mat[row][col + 1], row, col + 1);
                pq.add(p);
            }
            count++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = { { 16, 28, 60, 64 }, { 22, 41, 63, 91 }, { 27, 50, 87, 93 }, { 36, 78, 87, 94 } };
        System.out.println(kthSmallest(mat, 1));
    }
}
