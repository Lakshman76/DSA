// 918. Maximum Sum Circular Subarray

public class MaxCircularSubarray {
    static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int bestEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {
            bestEnding = Math.max(bestEnding + nums[i], nums[i]);

            ans = Math.max(ans, bestEnding);
        }

        return ans;
    }

    static int minSubarray(int nums[]) {
        int ans = nums[0];
        int bestEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {
            bestEnding = Math.min(bestEnding + nums[i], nums[i]);

            ans = Math.min(ans, bestEnding);
        }

        return ans;
    }

    static int maxSubarraySumCircular(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
        }
        int max = maxSubArray(nums);
        int min = minSubarray(nums);
        if (sum != min)
            min = sum - min;
        return Math.max(max, min);
    }

    public static void main(String[] args) {
        int[] nums = { 1, -2, 3, -2 };
        System.out.println(maxSubarraySumCircular(nums));
    }
}
