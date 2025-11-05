public class MazeWithObstacle {
    static int pathWithObstacle(Boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            return 1;
        }
        if (!maze[row][col]) {
            return 0;
        }
        int ans = 0;
        if (row < maze.length - 1) {
            ans += pathWithObstacle(maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            ans += pathWithObstacle(maze, row, col + 1);
        }
        return ans;
    }

    static void pathRestriction(String p, Boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        if (row < maze.length - 1) {
            pathRestriction(p + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            pathRestriction(p + "R", maze, row, col + 1);
        }
    }

    public static void main(String[] args) {
        Boolean[][] maze = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };
        System.out.println(pathWithObstacle(maze, 0, 0));
        pathRestriction("", maze, 0, 0);
    }
}
