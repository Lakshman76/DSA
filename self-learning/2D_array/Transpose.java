public class Transpose {

    public static void transpose(int matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;
        int newMatrix[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 }
        };
        transpose(matrix);
    }
}