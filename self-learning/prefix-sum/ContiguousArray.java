// 525. Contiguous Array - return the maximum length of a contiguous subarray with an equal number of 0 and 1.

import java.util.HashMap;

public class ContiguousArray {
    static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0;
        int curr_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            curr_sum += (nums[i] == 1) ? 1 : -1;

            if (map.containsKey(curr_sum)) {
                int idx = map.get(curr_sum);
                maxLen = Math.max(maxLen, i - idx);
            } else {
                map.put(curr_sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 1, 1, 0, 0, 0 };
        System.out.println(findMaxLength(nums));
    }
}
