// Question link - https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/0

// solution - 

class CheckSetBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int bitMask = 1 << k;
        if ((n & bitMask) != 0) {
            return true;
        } else {
            return false;
        }
    }
}