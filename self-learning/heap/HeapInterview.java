import java.util.Collections;
import java.util.PriorityQueue;
public class HeapInterview {

    // find height of heap
    static int heapHeight(int n, int arr[]) {
        if (n == 1)
            return 1;

        // return (int) (Math.log(n) / Math.log(2));

        // or

        // int height = 0;
        // int i = 1;
        // while (i < arr.length) {
        // i = (2 * i) + 1;
        // height++;
        // }

        // or

        int height = 0;

        while (n > 1) {
            height++;
            n = n / 2;
        }

        return height;
    }

    // Minimum cost of rope
    public static int minCost(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
        }

        int ans = 0;

        while (pq.size() > 1) {
            int sum = pq.poll();
            sum += pq.poll();
            pq.offer(sum);
            ans += sum;
        }

        return ans;
    }

    // Take Gifts From the Richest Pile
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            pq.offer(gift);
        }
        while (k > 0) {
            int num = pq.poll();
            int sqrt = (int) Math.sqrt(num);
            pq.offer(sqrt);
            k--;
        }

        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 25, 64, 9, 4, 100 };

        // System.out.println(heapHeight(arr.length, arr));

        // System.out.println(minCost(arr));

        System.out.println(pickGifts(arr, 4));
    }
}
