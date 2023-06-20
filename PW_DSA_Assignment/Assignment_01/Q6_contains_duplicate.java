// Q6. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:
// Input: nums = [1,2,3,1]

// Output: true



class Solution {
    public boolean containsDuplicate(int[] nums) {

        // 1st approach
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] == nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;    

        // 2nd approach

        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}