
// 💡 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// **Example:**
// Input: nums = [2,7,11,15], target = 9
// Output0 [0,1]

// **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1]

// ************************solution*************

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // first Approach

        // for(int i=0;i<nums.length;i++){

        //     for(int j=i+1;j<nums.length;j++){

        //             if(nums[i]+nums[j]==target){
        //                 int arr[] ={i,j};
        //                 return arr;
        //             }
        //     }
            
        // }
        // return null;

        // 2nd approach 

        int result [] = new int[2];
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
               result[0] = map.get(target-nums[i]);
               result[1] = i;
               return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}