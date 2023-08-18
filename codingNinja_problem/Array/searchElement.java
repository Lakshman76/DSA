// Question link - https://www.codingninjas.com/codestudio/problems/binary-search_972?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// Solution - 

public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
        
        // int first = 0;
        // int last = nums.length-1;
        // if(first <= last){
        //     int mid = first+(last-first)/2;
        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     else if(target > nums[mid]){
        //         first = mid+1;
        //     }
        //     else{
        //         last = mid-1;
        //     }
        // }
        // return -1;
    }
}