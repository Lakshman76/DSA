// Question link - https://www.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1

// solution - 

class Solution{
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        int count = 0;
        for(int i = 1; i <= n; i++){
            int num = i;
            while(num > 0){
                if((num & 1) != 0){
                    count++;
                }
                num = num >> 1;
            }
        }
        return count;
        
    }
}