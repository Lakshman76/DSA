// 152. Maximum Product Subarray
public class MaxProduct {
    static int maxProduct(int[] nums) {
        int ans = nums[0];
        int minEnd = nums[0];
        int maxEnd = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int p1 = minEnd * nums[i];
            int p2 = maxEnd * nums[i];

            minEnd = Math.min(nums[i], Math.min(p1, p2));
            maxEnd = Math.max(nums[i], Math.max(p1, p2));

            ans = Math.max(ans, Math.max(minEnd, maxEnd));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 3, -4 };
        System.out.println(maxProduct(nums));
    }
}
