// Question link - https://www.codingninjas.com/codestudio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// solution -

import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {

        // Brute force approach 

        // int ans[] = {-1, -1};
        // int j = 0;
        // for (int i = 0; i < arr.size(); i++) {
        //     if(arr.get(i) == k){
        //         ans[j] = i;
        //         j++;
        //     }
        // }
        // return ans;


        // Optimal approach


        int ans[] = {-1, -1};
        ans[0] = search(arr, k, true);
        if(ans[0] != -1){
           ans[1] = search(arr, k, false);
        }
        return ans;

    }   
    public static int search(ArrayList<Integer> arr , int target , boolean checkfirst){
        int ans = -1;
        int start = 0;
        int end = arr.size()-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr.get(mid) == target){
                ans=mid;
                if(checkfirst){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(target < arr.get(mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
};

