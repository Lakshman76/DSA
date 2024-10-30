// Question link - https://www.geeksforgeeks.org/problems/bit-manipulation-1666686020/0

// solution - 

class Solution {
    static void bitManipulation(int num, int i) {
        
        // Get bit
        int n = num;
        int bitMask = 1 << (i - 1);
        if((n & bitMask) == 0){
            System.out.print(0);
        } else {
             System.out.print(1);
        }
        
        // set bit
        n = n | bitMask;
        System.out.print(" "+n);
        
        // clear bit
        n = num;
        bitMask = ~bitMask;
        n = n & bitMask;
         System.out.print(" "+n);
    }
}
