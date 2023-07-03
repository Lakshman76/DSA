// Question 6
// Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

// A shift on s consists of moving the leftmost character of s to the rightmost position.

// For example, if s = "abcde", then it will be "bcdea" after one shift.
 
// Example 1:
// Input: s = "abcde", goal = "cdeab"
// Output: true

// Solution - 

class Solution {
    public boolean rotateString(String s, String goal) {
       if (s.length() != goal.length()) {
            return false;
        }
        
        // Perform the shift operation on s until we reach the original string s
        for (int i = 0; i < s.length(); i++) {
            // Check if s is equal to goal after the current number of shifts
            if (s.equals(goal)) {
                return true;
            }
            
            // Perform a shift operation on s
            char firstChar = s.charAt(0);
            s = s.substring(1) + firstChar;
        }
        
        // If we haven't found a match after all possible shifts, return false
        return false; 
    }
}