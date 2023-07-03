// Question 4
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Example 1:
// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

// Solution - 

class Solution {
    public String reverseWords(String s) {
        // Split the sentence into an array of words using whitespace as delimiter
        String[] words = s.split(" ");
        
        // Iterate through each word
        for (int i = 0; i < words.length; i++) {
            // Convert the word to a character array
            char[] charArray = words[i].toCharArray();
            
            // Reverse the order of characters in the word
            int left = 0;
            int right = charArray.length - 1;
            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            
            // Assign the reversed word back to the array
            words[i] = new String(charArray);
        }
        
        // Join the words back into a sentence using whitespace as separator
        return String.join(" ", words);
    }
}