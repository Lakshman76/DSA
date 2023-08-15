// Question link - https://www.codingninjas.com/codestudio/problems/ninja-and-the-zero-s_6581958?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// Solution -

public class Solution {
        public static int[] moveZeros(int n, int []a) {

/****************** Optimal Approach ********************/

        int k = 0;

        for (int i = 0; i < n; i++) {
            if(a[i] != 0){
                a[k] = a[i];
                k++;
            }
        }
        while(k < n){
            a[k++] = 0;
        }

        return a;
    }
}