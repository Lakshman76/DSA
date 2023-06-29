// 💡 Question 2
// Given two 0-indexed integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*
// - answer[0] *is a list of all distinct integers in* nums1 *which are not present in* nums2*.*
// - answer[1] *is a list of all distinct integers in* nums2 *which are not present in* nums1.

// Note that the integers in the lists may be returned in **any** order.

// Example 1:
// Input: nums1 = [1,2,3], nums2 = [2,4,6]
// Output: [[1,3],[4,6]]

// Explanation:
// For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
// For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].


// Solution - 

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : set1){
            if(!set2.contains(i)) 
                list1.add(i);
        }
        for (int i : set2){
            if(!set1.contains(i)) 
                list2.add(i);
        }
        
        result.add(list1);
        result.add(list2);
        return result; 
    }
}