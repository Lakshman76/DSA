// Question link - https://leetcode.com/problems/majority-element/

// solution -

class Solution {
    public int majorityElement(int[] nums) {
        // 1st approach
        // for(int i=0; i<nums.length-1; i++){
        //     int count = 0;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
            
        //     }
        //     if(count > nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return nums.length;

        // 2nd approach --> greedy method

        int major = nums[0];
        int majorCount = 1;
        for(int i=0; i<nums.length; i++){
            if(major == nums[i]){
                majorCount++;
            }
            else{
                majorCount--;

                if(majorCount == 0){
                    major=nums[i];
                    majorCount =1;
                }
            }
        }
        return major;
    }
}