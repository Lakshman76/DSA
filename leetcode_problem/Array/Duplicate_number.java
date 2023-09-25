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

        // Map <Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         return nums[i];
        //     }
        //     map.put(nums[i],i);
        // }
        // return nums.length;

        // 3rd and optimize approach

        int duplicate = -1;
        for(int i=0; i<nums.length; i++){
            int curr = Math.abs(nums[i]);
            if(nums[curr] < 0){
                duplicate = curr;
                break;
            }
            nums[curr] *= -1;
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }
        return duplicate;
    }
}