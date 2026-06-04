// 16. 3Sum Closest

import java.util.Arrays;

public class ThreeSumClosest {
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        int dist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                int tempDist = Math.abs(target - sum);
                if (tempDist < dist) {
                    dist = tempDist;
                    ans = sum;
                }
                if (sum < target) {
                    start++;
                } else if (sum > target) {
                    end--;
                } else {
                    return target;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 2, 1, -4 };
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
