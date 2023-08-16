// Question link - https://leetcode.com/problems/missing-number/

// Solution -

class Solution {
    public int missingNumber(int[] nums) {

        // 1st approach
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i < nums.length; i++){
        //     map.put(nums[i], i);
        // }
        // for(int i=0; i <= nums.length; i++){
        //     if(!map.containsKey(i)){
        //         return i;
        //     } 
        // }
        // return nums.length;

        // Gauss's formula ---> 2nd approach

        // int expectedSum = nums.length * (nums.length+1)/2;
        // int actualSum = 0;

        // for(int num : nums){
        //     actualSum += num;
        // }

        // return (expectedSum - actualSum);

        // using XOR 
        int missingElement = nums.length;
        
        for(int i=0; i<nums.length; i++){
            missingElement ^= i^nums[i];
        }
        return missingElement;
    }
}