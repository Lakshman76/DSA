// Question link - https://leetcode.com/problems/matrix-diagonal-sum/

// Solution - 

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int result = 0;
        for(int i=0; i<n; i++){
            result += mat[i][i];
            result += mat[n-i-1][i];
        }
        if(n%2 == 0){
            return result;
        }
        else{
            return result-mat[n/2][n/2];
        }
    }
}