// https://www.geeksforgeeks.org/problems/kth-largest-element-in-a-stream2220/1

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthLargestStream {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {

            if (pq.size() < k) {
                pq.add(num);
            } else if (num > pq.peek()) {
                pq.poll();
                pq.add(num);
            }

            result.add(pq.size() == k ? pq.peek() : -1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        System.out.println(kthLargest(arr, k));
    }
}
