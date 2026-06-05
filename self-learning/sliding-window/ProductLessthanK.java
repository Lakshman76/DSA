// 713. Subarray Product Less Than K

public class ProductLessthanK {
    static int numSubarrayProductLessThanK(int[] nums, int k) {
        int total = 0;
        int left = 0;
        int right = 0;
        long product = nums[0];
        while (right < nums.length) {
            if (product < k) {
                total += (right - left + 1);
                right++;
                if (right < nums.length) {
                    product *= nums[right];
                }
            } else {
                if (left == right) {
                    left++;
                    right++;
                    if (right < nums.length) {
                        product = nums[right];
                    }
                } else {
                    product /= nums[left];
                    left++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 10, 8, 100, 1000, 5, 15 };
        int k = 999;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
}
