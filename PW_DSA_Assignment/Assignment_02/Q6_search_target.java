// Question 6 
//Given an array of integers nums which is sorted in ascending order, and an integer target,
// write a function to search target in nums. If target exists, then return its index. Otherwise,
// return -1.

// You must write an algorithm with O(log n) runtime complexity.

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4

// Explanation: 9 exists in nums and its index is 4

//****************solution***********

class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;
        while(first <= last){
            int mid = first+(last-first)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                first = mid+1;
            }
            else{
                last = mid-1;                
            }
        }
        return -1;
    }
}