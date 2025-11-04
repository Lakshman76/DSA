import java.util.ArrayList;

public class Maze {
    static int CountMaze(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        return CountMaze(row - 1, col) + CountMaze(row, col - 1);
    }

    static void path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (row > 1) {
            path(p + "D", row - 1, col);
        }
        if (col > 1) {
            path(p + "R", row, col - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (row > 1) {
            ans.addAll(pathRet(p + "D", row - 1, col));
        }
        if (col > 1) {
            ans.addAll(pathRet(p + "R", row, col - 1));
        }
        return ans;
    }

    static ArrayList<String> pathRetDiagonal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (row > 1) {
            ans.addAll(pathRetDiagonal(p + "V", row - 1, col));
        }
        if (row > 1 && col > 1) {
            ans.addAll(pathRetDiagonal(p + "D", row - 1, col - 1));
        }
        if (col > 1) {
            ans.addAll(pathRetDiagonal(p + "H", row, col - 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(CountMaze(3, 3));
        // path("", 3, 3);
        // System.out.println(pathRet("", 3, 3));
        System.out.println(pathRetDiagonal("", 3, 3));
    }
}
