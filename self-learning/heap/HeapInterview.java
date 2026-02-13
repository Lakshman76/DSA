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

    // Sum of elements between k1'th and k2'th smallest elements
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {

        PriorityQueue<Long> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            if (pq1.size() >= K1) {
                if (A[i] < pq1.peek()) {
                    pq1.poll();
                    pq1.offer(A[i]);
                }
            } else {
                pq1.offer(A[i]);
            }

            if (pq2.size() >= K2 - 1) {
                if (A[i] < pq2.peek()) {
                    pq2.poll();
                    pq2.offer(A[i]);
                }
            } else {
                pq2.offer(A[i]);
            }
        }

        long sum1 = 0;
        while (!pq1.isEmpty()) {
            sum1 += pq1.poll();
        }

        long sum2 = 0;
        while (!pq2.isEmpty()) {
            sum2 += pq2.poll();
        }

        return (sum2 - sum1);
    }

    // Kth Largest in a Stream
    public static int[] kthLargest(int k, int[] arr, int n) {
        int[] ans = new int[n];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.offer(arr[i]);
            if (pq.size() == k) {
                ans[i] = pq.peek();
            } else if (pq.size() > k) {
                pq.poll();
                ans[i] = pq.peek();
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // System.out.println(heapHeight(arr.length, arr));

        // System.out.println(minCost(arr));

        // System.out.println(pickGifts(arr, 4));

        // System.out.println(sumBetweenTwoKth(arr, arr.length, 2, 6));

        int[] ans = kthLargest(4, arr, 6);
        for (int n : ans) {
            System.out.print(n + "  ");
        }
        System.out.println();
    }
}
