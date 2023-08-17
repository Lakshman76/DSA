// Question link - https://www.codingninjas.com/codestudio/problems/traffic_6682625?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// Solution -

public class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
        int maxOnes = 0;  // Maximum length of consecutive ones
        int left = 0;      // Window's starting position
        int zerosCount = 0; // Count of zeros encountered
        
        for (int right = 0; right < n; right++) {
            if (vehicle[right] == 0) {
                zerosCount++;
            }
            
            while (zerosCount > m) {
                if (vehicle[left] == 0) {
                    zerosCount--;
                }
                left++;
            }
            
            maxOnes = Math.max(maxOnes, right - left + 1);
        }
        
        return maxOnes;
    }
}