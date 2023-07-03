// Question 3
// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

// Example 1:
// Input: num1 = "11", num2 = "123"
// Output: "134"

// Solution - 

class Solution {
    public String addStrings(String num1, String num2) {
         StringBuilder sb = new StringBuilder();  // StringBuilder to store the result
        
        int carry = 0;  // Variable to store the carry
        
        int end1 = num1.length() - 1;  // Index for num1 string
        int end2 = num2.length() - 1;  // Index for num2 string
        
        // Process the digits from right to left
        while (end1 >= 0 || end2 >= 0) {
            int digit1 = (end1 >= 0) ? num1.charAt(end1) - '0' : 0;  // Convert char to integer digit
            int digit2 = (end2 >= 0) ? num2.charAt(end2) - '0' : 0;  // Convert char to integer digit
            
            int sum = digit1 + digit2 + carry;  // Calculate the sum
            
            carry = sum / 10;  // Calculate the carry
            sb.append(sum % 10);  // Append the digit to the StringBuilder
            
            end1--;  // Move to the next digit in num1
            end2--;  // Move to the next digit in num2
        }
        
        if (carry != 0) {
            sb.append(carry);  // If there is a remaining carry, append it to the StringBuilder
        }
        
        return sb.reverse().toString();
    }
}