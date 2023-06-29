// 💡 Question 6

// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return *an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant extra space.

// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]

// Solution - 

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                result.add(nums[i]);
            }
            map.put(nums[i],i);
        }
        return result;
    }
}