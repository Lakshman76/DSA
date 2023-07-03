// Question 2
// Given a string num which represents an integer, return true if num is a strobogrammatic number.
// A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
// Example 1:
// Input: num = "69"
// Output:
// true

class Solution {
    public boolean isStrobogrammatic(String num) {
        // Create a map to store the rotational mappings
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        // Initialize two pointers to check the characters from both ends of the string
        int left = 0;
        int right = num.length() - 1;

        // Traverse the string using the two pointers
        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            // If the left and right characters don't have a rotational mapping or don't match
            if (!map.containsKey(leftChar) || map.get(leftChar) != rightChar) {
                return false;
            }

            // Move the pointers towards the center
            left++;
            right--;
        }

        // If all characters have passed the rotational mapping check, the number is strobogrammatic
        return true;
    }
}