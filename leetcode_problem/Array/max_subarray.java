// Question link - https://leetcode.com/problems/maximum-subarray/

// Solution - 

class Solution {
    public int maxSubArray(int[] nums) {
        int neg_max = Integer.MIN_VALUE;
        int flag = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                flag++;
            }
            neg_max = Math.max(neg_max, nums[i]);
        }
        if(flag == nums.length){
            return neg_max;
        }
        else{
            int curr_sum = 0;
            int maxm_sum = Integer.MIN_VALUE;
            for(int i=0; i<nums.length; i++){
                curr_sum += nums[i];
                if(curr_sum < 0){
                    curr_sum = 0;
                }
                maxm_sum = Math.max(maxm_sum, curr_sum);
            }
            return maxm_sum;
        }
        
    }
}