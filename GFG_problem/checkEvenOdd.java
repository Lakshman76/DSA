// Question link - https://www.geeksforgeeks.org/problems/odd-or-even3618/0

// solution - 

class Solution {
    static String oddEven(int n) {
        // code here
        if ((n & 1) == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}