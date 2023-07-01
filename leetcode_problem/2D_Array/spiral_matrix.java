// Question link - https://leetcode.com/problems/spiral-matrix/

// Solution - 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int startRow=0;
        int startCol=0;
        int endRow=m-1;
        int endCol=n-1;
        while(startRow<=endRow && startCol<=endCol){
            // top
            for(int j=startCol; j<=endCol; j++){
                result.add(matrix[startRow][j]);
            }
            // right
            for(int i=startRow+1; i<=endRow; i++){
                result.add(matrix[i][endCol]);
            }
            // bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                result.add(matrix[endRow][j]);
            }
            // left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                result.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++; 
            endRow--;
            endCol--;           
        }
        return result;
    }
}