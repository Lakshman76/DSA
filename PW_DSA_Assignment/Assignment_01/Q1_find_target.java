class Solution {
    public int[] twoSum(int[] nums, int target) {

        // first Approach

        // for(int i=0;i<nums.length;i++){

        //     for(int j=i+1;j<nums.length;j++){

        //             if(nums[i]+nums[j]==target){
        //                 int arr[] ={i,j};
        //                 return arr;
        //             }
        //     }
            
        // }
        // return null;

        // 2nd approach 

        int result [] = new int[2];
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
               result[0] = map.get(target-nums[i]);
               result[1] = i;
               return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}