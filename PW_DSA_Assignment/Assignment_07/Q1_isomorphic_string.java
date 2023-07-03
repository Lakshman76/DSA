// Question 1
// Given two strings s and t, *determine if they are isomorphic*.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

// Example 1:
// Input: s = "egg", t = "add"
// Output: true

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(! map.containsKey(original)){
                if(! map.containsValue(replacement)){
                    map.put(original, replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedChar = map.get(original);
                if(mappedChar != replacement){
                    return false;
                }
            }
        }
        return true;
    }
}