public class Diagonal_sum {

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;
        // O(n^2)
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } else if (i + j == n - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // Optimize - O(n)
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            if(i != n-i-1){
                sum += matrix[i][n-i-1];
            }
        }
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        diagonalSum(matrix);
    }
}