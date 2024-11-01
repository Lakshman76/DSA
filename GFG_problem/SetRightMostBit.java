// Question link - https://www.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1

// solution - 

class Solution {
    static int setBit(int n) {
        // code here
        int num = n;
        int count = 0;
        while (n >= 0) {
            if ((n & 1) == 0) {
                int bitMask = 1 << count;
                return num | bitMask;
            }
            count++;
            n = n >> 1;
        }
        return num;
    }
}