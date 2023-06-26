// Question 3
// Given an array nums of n integers, return an array of all the unique quadruplets
// [nums[a], nums[b], nums[c], nums[d]] such that:
//            ● 0 <= a, b, c, d < n
//            ● a, b, c, and d are distinct.
//            ● nums[a] + nums[b] + nums[c] + nums[d] == target

// You may return the answer in any order.

// Example 1:
// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

// solution - 

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<nums.length-2; i++){
            int start = i+1;
            int end = nums.length-1;
            while(start < end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    start++;
                }
                else{
                    end--;
                }
                int diff = Math.abs(sum - target);
                if(diff < minDiff){
                    result = sum;
                    minDiff = diff;
                }
            }
        }
        return result;
    }
}