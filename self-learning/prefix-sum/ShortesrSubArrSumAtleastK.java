// 862. Shortest Subarray with Sum at Least K

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortesrSubArrSumAtleastK {
    static int shortestSubarray(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;

        long[] prefix = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < prefix.length; i++) {

            while (!deque.isEmpty() &&
                    prefix[i] - prefix[deque.peekFirst()] >= k) {
                ans = Math.min(ans, i - deque.pollFirst());
            }

            while (!deque.isEmpty() &&
                    prefix[i] <= prefix[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offerLast(i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {
        int[] nums = { 3, -2, 5, -1, 2, -3, 4 };
        int k = 6;
        System.out.println(shortestSubarray(nums, k));
    }
}
