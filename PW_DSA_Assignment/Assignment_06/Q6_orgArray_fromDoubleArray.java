// Question 6
// An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.

// Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.

// Example 1:
// Input: changed = [1,3,4,2,6,8]
// Output: [1,3,4]

// Explanation: One possible original array could be [1,3,4]:
// - Twice the value of 1 is 1 * 2 = 2.
// - Twice the value of 3 is 3 * 2 = 6.
// - Twice the value of 4 is 4 * 2 = 8.
// Other original arrays could be [4,3,1] or [3,1,4].

// Solution - 

class Solution {
    public int[] findOriginalArray(int[] changed) {

        int n= changed.length;
        if(n%2!=0){
            return new int[0];
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans[] = new int[n/2];
        for(int i=0;i<n;i++){
            hm.put(changed[i], hm.getOrDefault(changed[i],0)+1);
        }

        int temp = 0;
        Arrays.sort(changed);
        for(int i: changed){
            if(hm.get(i)<=0){
                continue;
            }
         
            if(hm.getOrDefault(2*i,0)<=0){   
                return new int[0];
            }
            ans[temp++] = i;
            hm.put(i, hm.get(i)-1); 
            hm.put(2*i, hm.get(2*i)-1);
        }
        return ans;
    }
}