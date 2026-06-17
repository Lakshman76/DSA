// 268. Missing Number

import java.util.Arrays;

public class OneMissingNum {
    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    static int missingNumber(int[] nums) {
        // Cyclic Sort
        int n = nums.length;
        int idx = 0;
        while(idx < n) {
            if (nums[idx] < n && nums[idx] != idx) {
                swap(nums, nums[idx], idx);
            } else {
                idx++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < n; i++) {
            if (i != nums[i])
                return i;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums));
    }
}
