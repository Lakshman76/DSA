// 1749. Maximum Absolute Sum of Any Subarray

public class MaxAbsoluteSum {
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

    static int maxAbsoluteSum(int[] nums) {
        return Math.max(maxSubArray(nums), Math.abs(minSubarray(nums)));

    }

    public static void main(String[] args) {
        int[] nums = { 1, -3, 2, 3, -4 };
        System.out.println(maxAbsoluteSum(nums));
    }
}
