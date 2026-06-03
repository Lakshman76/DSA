// 15. 3Sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = nums.length - 1;

            int sum = -1 * nums[i];
            while (start < end) {
                int tempSum = nums[start] + nums[end];
                if (tempSum == sum) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    while (start < nums.length && nums[start] == nums[start - 1]) {
                        start++;
                    }
                    while (end >= 0 && nums[end] == nums[end + 1]) {
                        end--;
                    }
                } else if (tempSum > sum) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 0 };
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
        // for (int i = 0; i < nums.length; i++) {

        // }
    }
}
