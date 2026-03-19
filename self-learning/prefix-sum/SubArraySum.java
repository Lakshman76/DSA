// 560. Subarray Sum Equals K
public class SubArraySum {
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

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
}
