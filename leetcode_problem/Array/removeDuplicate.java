// Question link - https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// Solution -

/****************** Optimal Approach ********************/

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
}