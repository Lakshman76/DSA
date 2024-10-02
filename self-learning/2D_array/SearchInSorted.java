public class SearchInSorted {

    public static void binarySearch(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[0].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (key == matrix[i][mid]) {
                    System.out.println("Found at (" + i + ", " + mid + ")");
                    return;
                } else if (key > matrix[i][mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int key = 6;
        binarySearch(matrix, key);
    }
}