// Question link - https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse

// Solution - 

import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {

/****************** Brute force ********************/
        // Time = O(nlogn)
        // space = O(logn) --> sort

        Arrays.sort(arr);

        return arr[arr.length-1];


/****************** 2nd approach ********************/
        // Time = O(n)
        // space = O(1)

        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(sum, arr[i]);
        }
        return sum;


/****************** 3rd approach ********************/
        // Time = O(n)
        // space = O(1)

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] > max ){
                max = arr[i];
            }
        }
        return max;

    }
}