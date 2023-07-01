// Question 7
// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
// Example 1:
// Input: n = 3
// Output: [[1,2,3],[8,9,4],[7,6,5]]

// Solution - 

class Solution {
    public int[][] generateMatrix(int n) {
        int result[][] = new int [n][n];
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=n-1;
        int count = 0;
        while(startRow<=endRow && startCol<=endCol){
            // top
            for(int j=startCol; j<=endCol; j++){
                result[startRow][j] = ++count;
            }
            // right
            for(int i=startRow+1; i<=endRow; i++){
                result[i][endCol] = ++count;
            }
            // bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                result[endRow][j] = ++count;
            }
            // left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                result[i][startCol] = ++count;
            }
            startRow++;
            startCol++; 
            endRow--;
            endCol--;           
        }
        return result;
    }
}