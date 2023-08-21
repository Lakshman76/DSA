// Question link - https://www.codingninjas.com/codestudio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// solution -

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        
        // Brute force
        
        int maxLen = 0;

        for (int i = 0; i < a.length; i++) {
            long sum = 0;
            for (int j = i; j < a.length; j++) {
               sum +=  a[j];

               if(sum == k){
                   maxLen = Math.max(maxLen, j-i+1);
               }
            }
        }
        return maxLen;
    }
}