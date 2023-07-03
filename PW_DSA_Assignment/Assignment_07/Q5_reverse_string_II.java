// Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

// If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

// Example 1:
// Input: s = "abcdefg", k = 2
// Output: "bacdfeg"

// Solution - 

class Solution {
    public String reverseStr(String s, int k) {
        // Convert the input string to a character array for easy manipulation
        char[] chars = s.toCharArray();
        int n = chars.length;

        // Iterate through the string in chunks of 2k characters
        for (int i = 0; i < n; i += 2 * k) {
            // Find the start and end indices of the chunk
            int start = i;
            int end = Math.min(i + k - 1, n - 1); // If fewer than k characters are left, reverse all of them

            // Reverse the first k characters in the chunk
            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        // Convert the character array back to a string and return it
        return String.valueOf(chars);
    }
}