public class NQueen {
    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        // check diagonal left
        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j]) {
                return false;
            }
            i--;
            j--;
        }
        // check diagonal right
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < board.length) {
            if (board[i][j]) {
                return false;
            }
            i--;
            j++;

        }
        return true;
    }

    static int nQueen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueen(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueen(board, 0));
    }
}
