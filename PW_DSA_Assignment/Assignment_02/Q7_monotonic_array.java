// Question 7
// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
// monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

// Example 1:
// Input: nums = [1,2,2,3]
// Output: true

// ****************solution***************

class Solution {
    public boolean isMonotonic(int[] nums) {
        int count1=0;
        int count2=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] >= nums[i-1]){
                count1++;
            }
            if(nums[i] <= nums[i-1]){
                count2++;
            }
        }
        if(count1 == nums.length-1 || count2 == nums.length-1){
            return true;
        }else {
            return false;
        }
    }
}