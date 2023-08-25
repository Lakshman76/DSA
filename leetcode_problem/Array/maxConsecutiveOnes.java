// Question link - https://leetcode.com/problems/max-consecutive-ones/

// Solution -

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        // optimize approach 

        int maxOnes = 0;
        int currentStreak = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                currentStreak++;
                maxOnes = Math.max(maxOnes, currentStreak);
            }
            else{
                
                currentStreak = 0;
            }
        }
        return maxOnes;
    }
}