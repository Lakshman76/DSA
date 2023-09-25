// Question link - https://leetcode.com/problems/max-consecutive-ones/

// Solution -

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        //Both are optimized approach 

        // int maxOnes = 0;
        // int currentStreak = 0;

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] != 0){
        //         currentStreak++;
        //     }
        //     else{
        //         currentStreak = 0;
        //     }
        //     maxOnes = Math.max(maxOnes, currentStreak);
        // }
        // return maxOnes;

        int maxOnes = 0;
        int count = 0;

        for(int num : nums){
            if(num != 0){
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