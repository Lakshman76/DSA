// 💡 Question 3
// Given an array of integers arr, return *true if and only if it is a valid mountain array*.
// Recall that arr is a mountain array if and only if:
// - arr.length >= 3
// - There exists some i with 0 < i < arr.length - 1 such that:
//     - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//     - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

// Example 1:
// Input: arr = [2,1]
// Output:
// false

// Solution - 

class Solution {
    public boolean validMountainArray(int[] arr) {
       if(arr.length < 3){
           return false;
       } 
       if(arr[0]>arr[1]){
           return false;
       }
       int mount = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                mount = i;
                break;
            }
        }
        for(int i=0; i<mount; i++){
            if(arr[i] >= arr[i+1]){
                return false;
            }
        }
        for(int i=mount+1; i<arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                return false;
            }
        }
        return true;
    }
}