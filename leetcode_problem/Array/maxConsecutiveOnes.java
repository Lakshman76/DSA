// Question link - https://leetcode.com/problems/max-consecutive-ones/

// Solution -

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                count++;
                maxOnes = Math.max(maxOnes, count);
            }
            else{
                
                count = 0;
            }
        }
        return maxOnes;
    }
}