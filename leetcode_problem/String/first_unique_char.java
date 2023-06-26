// Question link - https://leetcode.com/problems/first-unique-character-in-a-string/

// solution - 
class Solution {
    public int firstUniqChar(String s) {

        // first approach --> it takes too much time

        // for(int i=0; i<s.length(); i++){
        //     int count = 0;
        //     for(int j=0; j<s.length(); j++){
        //         if(s.charAt(i) == s.charAt(j)){
        //             count++;
        //         }
        //     }
        //     if(count == 1){
        //         return i;
        //     }
        // }
        // return -1;

        // 2nd approach

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int freq = map.getOrDefault(c, 0);

            map.put(c, freq+1);            
        }
        for(int i=0; i<s.length(); i++){
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}