import java.util.PriorityQueue;

public class FurthestBuilding {

    // Furthest Building You Can Reach
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];

            // Only consider jumps that require climbing up
            if (diff > 0) {
                pq.add(diff); // Track this jump in the heap

                // If bricks are insufficient, replace the largest used bricks with a ladder
                if (pq.size() > ladders) {
                    bricks -= pq.poll(); // Remove the smallest jump once ladders replace enough bricks
                }

                // If bricks run out, return the current position
                if (bricks < 0) {
                    return i;
                }
            }
        }
        return heights.length - 1;
    }

    public static void main(String[] args) {
        int[] heights = { 4, 2, 7, 6, 9, 14, 12 };

        System.out.println(furthestBuilding(heights, 5, 1));
    }
}
