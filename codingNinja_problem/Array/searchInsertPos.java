// Question link - https://www.codingninjas.com/codestudio/problems/algorithm-to-find-best-insert-position-in-sorted-array_839813?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// solution -

public class Solution {
    public static int searchInsert(int [] arr, int m){
        // Brute force approach
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] >= m ){
        //         return i;
        //     }
        // }
        // return arr.length;

        // optimize approach

        int first = 0;
        int last = arr.length-1;
        
        while(first <= last){
            int mid = first+(last-first)/2;

            if(arr[mid] == m){
                return mid;
            }
            else if(arr[mid] < m){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return first;
    }
}