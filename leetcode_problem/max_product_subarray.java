// Question link - https://leetcode.com/problems/maximum-product-subarray/

// Solution - 

class Solution {
    public int maxProduct(int[] nums) {
       // first approach 
    //    int result = nums[0];
    //    int product;
    //    for(int i=0; i<nums.length; i++){
    //         product = 1;
    //        for(int j=i; j<nums.length; j++){
    //            product *= nums[j];
    //            result = Math.max(result, product);
    //        }
    //    } 
    //    return result;

        // 2nd approach
        int maxm = nums[0];
        int minm = nums[0];
        int result = maxm;
        for(int i=1; i<nums.length; i++){
            int current = nums[i];
            int temp_max = Math.max(current, Math.max(current*maxm, current*minm));
            minm = Math.min(current, Math.min(current*maxm, current*minm));
            maxm = temp_max;
            result = Math.max(result, maxm);

        }
        return result;
    }
}