// Question 6
// Given a non-empty array of integers nums, every element appears twice except
// for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only
// constant extra space.

// Example 1:
// Input: nums = [2,2,1]
// Output: 1

// Soltion - 

class Solution {
    public int singleNumber(int[] nums) {

        // first approach --> brute force
        // Time - O(n*n)
        // space - O(1)

        // for(int i=0; i<nums.length; i++){
        //     int count = 0;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count == 1){
        //         return nums[i];
        //     }
        // }
        // return nums.length;  

        // 2nd approach -> hashmap
        // Time - O(n)
        // space - O(n)
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     int freq = map.getOrDefault(nums[i], 0);
        //     map.put(nums[i], freq+1);
        // }
        // for(int i=0; i<nums.length; i++){
        //     if(map.get(nums[i]) == 1){
        //         return nums[i];
        //     }
        // }
        // return nums.length;

        // 3rd approach -> bitwise operator
        // Time - O(n)
        // space - O(1)
        
        int result = nums[0];
        for(int i=1; i<nums.length; i++){
            result = result ^ nums[i];
        }
        return result;

    }
}