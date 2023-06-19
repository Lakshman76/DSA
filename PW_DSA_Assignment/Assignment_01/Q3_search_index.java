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