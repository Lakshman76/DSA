// leetcode 396

public class RotateFunction {
    static int sum(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        return totalSum;
    }

    static int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int totalSum = sum(nums);
        int fn = 0;

        for (int i = 0; i < n; i++) {
            fn += (i * nums[i]);
        }

        int max = fn;

        for (int i = 1; i < n; i++) {
            fn = fn + totalSum - (n * nums[n - i]);
            max = Math.max(max, fn);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 6 };
        System.out.println(maxRotateFunction(nums));
    }
}
