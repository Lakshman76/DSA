// 💡 Question 1
// A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

// - s[i] == 'I' if perm[i] < perm[i + 1], and
// - s[i] == 'D' if perm[i] > perm[i + 1].

// Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

// Example 1:
// Input: s = "IDID"
// Output:
// [0,4,1,3,2]

// Solution - 

class Solution {
    public int[] diStringMatch(String s) {
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = s.length();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){
                list.add(start);
                start++;
            }
            else{
                list.add(end);
                end--;
            }
        }
        if(s.charAt(s.length()-1) == 'I'){
            list.add(start);
        }else{
            list.add(end);
        }
        int result[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}