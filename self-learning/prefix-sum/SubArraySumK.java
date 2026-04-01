// 560. Subarray Sum Equals K

import java.util.HashMap;

public class SubArraySumK {
    // Brute force - O(n^2)
    static int subarraySum(int[] nums, int k) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    total++;
                }
            }
        }
        return total;
    }

    // Optimized
    static int subarraySumOptimized(int[] nums, int k) {
        int total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int curr_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            curr_sum += nums[i];
            total += map.getOrDefault(curr_sum - k, 0);
            map.put(curr_sum, map.getOrDefault(curr_sum, 0) + 1);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(nums, k));
        System.out.println(subarraySumOptimized(nums, k));
    }
}
