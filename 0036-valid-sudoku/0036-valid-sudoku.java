class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char rowCh = board[i][j];
                if (rowCh != '.') {
                    if (rowSet.contains(rowCh)) return false;
                    rowSet.add(rowCh);
                }
                char colCh = board[j][i];
                if (colCh != '.') {
                    if (colSet.contains(colCh)) return false;
                    colSet.add(colCh);
                }
            }
        }

        // Check all 3 × 3 boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> boxSet = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        char ch = board[i][j];
                        if (ch != '.') {
                            if (boxSet.contains(ch)) return false;
                            boxSet.add(ch);
                        }
                    }
                }
            }
        }

        return true;
    }
}