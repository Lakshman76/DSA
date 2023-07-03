// Question 7
// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
// Note that after backspacing an empty text, the text will continue empty.

// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".

// Solution - 

class Solution {
    public boolean backspaceCompare(String s, String t) {
        // Process the strings and obtain the final processed strings
        String finalS = processString(s);
        String finalT = processString(t);
        
        // Compare the final processed strings and return the result
        return finalS.equals(finalT);
    }
    
    private static String processString(String str) {
        Stack<Character> stack = new Stack<>(); // Stack to simulate backspaces
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c); // If the character is not a backspace, push it onto the stack
            } else if (!stack.isEmpty()) {
                stack.pop(); // If the character is a backspace and the stack is not empty, remove the topmost element (representing a backspace)
            }
        }
        return String.valueOf(stack); // Convert the stack to a string and return the final processed string
    }
}