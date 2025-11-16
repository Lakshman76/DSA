public class MazeAllPath {
    static void allPath(Boolean[][] maze, int row, int col, String p) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        // down
        if (row < maze.length - 1) {
            allPath(maze, row + 1, col, p + "D");
        }
        // right
        if (col < maze[0].length - 1) {
            allPath(maze, row, col + 1, p + "R");
        }
        // Top
        if (row > 0) {
            allPath(maze, row - 1, col, p + "T");
        }
        // Left
        if (col > 0) {
            allPath(maze, row, col - 1, p + "L");
        }
        maze[row][col] = true;
    }

    public static void main(String[] args) {
        Boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        allPath(maze, 0, 0, "");
    }
}
