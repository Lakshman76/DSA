// 3300. Minimum Element After Replacement With Digit Sum
public class MinElement {
    static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    static int minElement(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int digitSum = digitSum(nums[i]);
            smallest = Math.min(smallest, digitSum);
            nums[i] = digitSum;
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 12, 13, 14 };
        System.out.println(minElement(nums));
    }
}
