import java.util.Scanner;

public class DFSMain {
    public static void main(String[] args) {
        DFS dfs = new DFS();
        Scanner sc = new Scanner(System.in);
        dfs.insert(sc);
        dfs.display();

        // dfs.diameterOfBinaryTree();
        // dfs.invertTree();
        // dfs.maxDepth();

        // int nums[] = { -10, -3, 0, 5, 9 };
        // dfs.sortedArrayToBST(nums);
        // dfs.display();

        // dfs.flatten();
        // dfs.display();

        // dfs.flattenOptimized();

        // dfs.isValidBST();

        dfs.lowestCommonAncestor();
    }
}
