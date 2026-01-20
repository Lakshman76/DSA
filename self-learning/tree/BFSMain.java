import java.util.Scanner;

public class BFSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BFS bfs = new BFS();
        bfs.insert(sc);
        bfs.display();
        // bfs.bfsTraversal();
        // bfs.levelOrder();
        // bfs.averageOfLevels();
        // bfs.findSuccessor();
        bfs.zigzagLevelOrder();
    }
}
