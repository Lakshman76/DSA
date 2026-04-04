// 53. Maximum Subarray
public class MaxSubarray {
    static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int bestEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {
            bestEnding = Math.max(bestEnding + nums[i], nums[i]);

            ans = Math.max(ans, bestEnding);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }
}
