// Question link - https://www.codingninjas.com/codestudio/problems/unique-element-in-sorted-array_1112654?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// solution -

import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        // Optimize code 
        
        int ans = 0;
        for (int element : arr) {
            ans = ans ^ element;
        }
        return ans;
    }
}