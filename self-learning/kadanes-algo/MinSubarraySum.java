// https://www.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray

public class MinSubarraySum {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int ans = a[0];
        int bestEnding = a[0];

        for (int i = 1; i < size; i++) {
            bestEnding = Math.min(bestEnding + a[i], a[i]);

            ans = Math.min(ans, bestEnding);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, -4, 2, -3, -1, 7, -5 };
        System.out.println(smallestSumSubarray(arr, arr.length));
    }
}
