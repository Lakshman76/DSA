// Question link - https://leetcode.com/problems/kth-largest-element-in-an-array/

// Solution - 

class Solution {
    public int findKthLargest(int[] nums, int k) {
        //1st approach
        
        // Arrays.sort(nums);
        // int i=nums.length-1;
        // while(k>1){
        //     i--;
        //     k--;
        // }
        // return nums[i];

        // 2nd approach 

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(nums[i]);
        }
        for(int i=k; i<nums.length; i++){
            if(pq.peek() < nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}