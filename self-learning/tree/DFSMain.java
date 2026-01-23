import java.util.Scanner;

public class DFSMain {
    public static void main(String[] args) {
        DFS dfs = new DFS();
        Scanner sc = new Scanner(System.in);
        dfs.insert(sc);
        dfs.display();

        dfs.diameterOfBinaryTree();
    }
}
