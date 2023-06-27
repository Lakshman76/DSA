// Question 7
// You are given an inclusive range [lower, upper] and a sorted unique integer array nums, where all elements are within the inclusive range.

// A number x is considered missing if x is in the range [lower, upper] and x is not in nums.

// Return the shortest sorted list of ranges that exactly covers all the missing
// numbers. That is, no element of nums is included in any of the ranges, and each
// missing number is covered by one of the ranges.

// Example 1:
// Input: nums = [0,1,3,50,75], lower = 0, upper = 99
// Output: [[2,2],[4,49],[51,74],[76,99]]

// Explanation: The ranges are:
// [2,2]
// [4,49]
// [51,74]
// [76,99]

import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        int nums1[] = {0,1,3,50,74};
        int lower1=0, upper1=99;
        System.out.println(findMissingRanges(nums1,lower1,upper1));

        int nums2[] = {1,3,19,50,74};
        int lower2=10, upper2=110;
        System.out.println(findMissingRanges(nums2,lower2,upper2));
    }
    public static List<String> findMissingRanges(int nums[], int low, int up){
        List<String> ranges = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > low ) {
                count++;
                if(nums[i] - low == 1){
                    ranges.add(low+"");
                }
                else {
                    ranges.add(low+"->"+(nums[i]-1));
                }
            }
            if (count >= 1){
                low = nums[i]+1;
            }
        }
        if(low == up){
            ranges.add(low+"");
        }else if(low < up){
            ranges.add(low+"->"+up);
        }
        return ranges;
    }

}
// output - 
//  [0, 2, 4->49, 51->73, 75->99]
//  [10->18, 20->49, 51->73, 75->110]