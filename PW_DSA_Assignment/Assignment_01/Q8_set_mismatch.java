//Q8. You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// Example 1:
// Input: nums = [1,2,2,4]
// Output: [2,3]


// ANS- 

class Solution {
    public int[] findErrorNums(int[] nums) {
        int result[] = new int[2];
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                result[0] = nums[i];
            }
            map.put(nums[i], i);
        }
        for(int i=1; i<=nums.length; i++){
            if(!map.containsKey(i)){
                result[1] = i;
            }
        }
        
        return result;
    }
}