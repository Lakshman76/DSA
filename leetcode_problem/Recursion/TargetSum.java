// 494

import java.util.Arrays;

public class TargetSum {
    static int findWays(int p, int[] up, int[] nums, int target) {
        if (up.length == 0) {
            return p == target ? 1 : 0;
        }
        int count = 0;
        count += findWays(p + (-1 * up[0]), Arrays.copyOfRange(up, 1, up.length), nums, target);
        count += findWays(p + up[0], Arrays.copyOfRange(up, 1, up.length), nums, target);
        return count;
    }

    static int findTargetSumWays(int[] nums, int target) {
        return findWays(0, nums, nums, target);
    }

    public static void main(String[] args) {
        int[] nums = { 1 };
        System.out.println(findTargetSumWays(nums, 1));
    }
}
