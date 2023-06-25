// Question 4
// Given a sorted array of distinct integers and a target value, return the index if the
// target is found. If not, return the index where it would be if it were inserted in
// order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2

// ***************Solution********************

class Solution {
    public int searchInsert(int[] nums, int target) {
        // first approach - O(n)

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] >= target){
        //         return i;
        //     }
        // }
        // return nums.length;

        // O(logn) using binary search

        int first = 0;
        int last = nums.length-1;
        
        while(first <= last){
            int mid = first+(last-first)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return first;

    }
}