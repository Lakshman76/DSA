// rearrange array by alternate +ve and -ve

import java.util.Arrays;

public class Rearrange {
    static int[] rearrange(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans[even] = nums[i];
                even += 2;
            } else {
                ans[odd] = nums[i];
                odd += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -1, 5, -2, 6, -3, -4 };
        System.out.println(Arrays.toString(rearrange(nums)));
    }
}
