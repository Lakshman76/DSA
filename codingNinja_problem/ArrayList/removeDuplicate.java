// Question link - https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

// Solution -

import java.util.ArrayList;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		
/****************** Optimal Approach ********************/

		int k = 0;

        for(int i=1; i<n; i++){
            if(arr.get(k) != arr.get(i)){
                k++;
                arr.set(k, arr.get(i));
            }
        }

        return k+1;
	}
}