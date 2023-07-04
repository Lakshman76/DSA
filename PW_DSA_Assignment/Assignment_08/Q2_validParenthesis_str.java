// Question 2
// Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

// The following rules define a valid string:

// Any left parenthesis '(' must have a corresponding right parenthesis ')'.
// Any right parenthesis ')' must have a corresponding left parenthesis '('.
// Left parenthesis '(' must go before the corresponding right parenthesis ')'.
// '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 

// Example 1:

// Input: s = "()"
// Output: true

// Solution - 

int openCount = 0; // Count of open parentheses '('
        int asteriskCount = 0; // Count of asterisks '*'

        // Scan the string from left to right
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == '*') {
                asteriskCount++;
            } else { // c == ')'
                if (openCount > 0) {
                    openCount--;
                } else if (asteriskCount > 0) {
                    asteriskCount--;
                } else {
                    return false; // Invalid: No matching '(' or '*' found
                }
            }
        }

        // Now, there may be some remaining open parentheses '('
        // and asterisks '*' that can be matched

        // Match remaining '(' with '*' if possible
        while (openCount > 0 && asteriskCount > 0) {
            openCount--;
            asteriskCount--;
        }

        // If all open parentheses have been matched, the string is valid
        return openCount == 0;