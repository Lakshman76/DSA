// Question link - https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTab=1

// Solution - 

import java.util.* ;
import java.io.*; 
import java.util.*;

public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {

/****************** Brute force ********************/

        // time = O(nlogn)
        // space = O(1)

        Arrays.sort(a);

        return new int[] {a[n-2], a[1]};


/****************** 2nd Approach ********************/

        // time = O(n)
        // space = O(1) 

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        int secMax = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(secMax > a[i] && a[i] != max){
                secMax = a[i];
            }
            if(secMin < a[i] && a[i] != min){
                secMin = a[i];
            }
        }
    
        return new int[] {secMax, secMin};

/****************** 3rd Approach ********************/

        // time = O(n)
        // space = O(1) 

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                secMax = max;
                max = a[i];
            } else if (a[i] > secMax && a[i] != max) {
                secMax = a[i];
            }

            if (a[i] < min) {
                secMin = min;
                min = a[i];
            } else if (a[i] < secMin && a[i] != min) {
                secMin = a[i];
            }
        }

        return new int[] { secMax, secMin };

    }
}