// Question 8
// Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix) mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.

// Example 1:
// Input: mat1 = [[1,0,0],[-1,0,3]], mat2 = [[7,0,0],[0,0,0],[0,0,1]]
// Output:
// [[7,0,0],[-7,0,3]]

// Solution - 

public class SparseMatrixMultiplication {

    public int[][] multiplySparseMatrices(int[][] matrixA, int[][] matrixB) {
        
        if (matrixA[0].length != matrixB.length) {
            return new int[0][0];
        }

        int[][] resultMatrix = new int[matrixA.length][matrixB[0].length];

        for (int rowA = 0; rowA < resultMatrix.length; rowA++) {
            for (int colA = 0; colA < matrixA[0].length; colA++) {
                if (matrixA[rowA][colA] != 0) {
                    for (int colB = 0; colB < resultMatrix[0].length; colB++) {
                        resultMatrix[rowA][colB] += matrixA[rowA][colA] * matrixB[colA][colB];
                    }
                }
            }
        }

        return resultMatrix;
    }
}
