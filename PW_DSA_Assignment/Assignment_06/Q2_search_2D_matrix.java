// Question 2
// You are given an m x n integer matrix matrix with the following two properties:
// - Each row is sorted in non-decreasing order.
// - The first integer of each row is greater than the last integer of the previous row.

// Given an integer target, return true *if* target *is in* matrix *or* false *otherwise*.

// You must write a solution in O(log(m * n)) time complexity.

// Example 1:
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

// Solution - 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 1st approach --> brute force 
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // 2nd approach --> Binary search
        int m = matrix.length;
        int n = matrix[0].length;
        if(m == 0){
            return false;
        }

        int first = 0;
        int last = m*n-1;
        while(first <= last){

            int mid = first + (last - first)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target){
                return true;
            }
            else if(target < matrix[row][col]){
                last = mid-1;
            }
            else{
                first = mid+1;
            }
        }
        return false;
    }
}