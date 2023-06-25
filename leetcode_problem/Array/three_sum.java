// Question link - https://leetcode.com/problems/3sum/

// Solution - 

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();

        for(int i=0; i<nums.length-2; i++){
            int start=i+1;
            int end=nums.length-1;
            while(start < end){
                int sum = nums[i]+nums[start]+nums[end];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                }
                else if(sum < 0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}