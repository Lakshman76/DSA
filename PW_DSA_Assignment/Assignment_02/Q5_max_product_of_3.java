// Question 3
// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

// Example 1:
// Input: nums = [1,2,3]
// Output: 6

// ****************Solution******************

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        // case 1 - 3,4,5,6,7  Ans--> 5*6*7
        // case 2 - -50,-20,-15,6,7,8  Ans--> -50*-20*8
        int n = nums.length;
        int result = Math.max(nums[n-1]*nums[n-2]*nums[n-3], nums[0]*nums[1]*nums[n-1]);

        return result;       
    }
}