// Question 4
// Given a binary array nums, return *the maximum length of a contiguous subarray with an equal number of* 0 *and* 1.

// Example 1:
// Input: nums = [0,1]
// Output: 2
// Explanation:
// [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.


// Solution - 


class Solution {
    public int findMaxLength(int[] nums) {
        // Create a map to store the running sum and its corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize the map with a sum of 0 at index -1

        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // Increment count if nums[i] is 1, otherwise decrement it
            count += nums[i] == 1 ? 1 : -1;

            if (map.containsKey(count)) {
                // If the map already contains the count, calculate the length of subarray
                int len = i - map.get(count);
                maxLen = Math.max(maxLen, len);
            } else {
                // If the count is encountered for the first time, add it to the map
                map.put(count, i);
            }
        }

        return maxLen;
    }
}
