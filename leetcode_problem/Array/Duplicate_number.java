// Question link - https://leetcode.com/problems/find-the-duplicate-number/

// solution - 

class Solution {
    public int findDuplicate(int[] nums) {
        // 1st approach
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] == nums[i-1]){
        //         return nums[i];
        //     }
        // }
        // return nums.length;

        // 2nd approach

        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i],i);
        }
        return nums.length;
    }
}