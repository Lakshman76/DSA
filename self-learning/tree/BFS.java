import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert Element
    public void insert(Scanner sc) {
        System.out.println("Enter the root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        insert(sc, root);
    }

    private void insert(Scanner sc, Node node) {
        System.out.println("Do you want to insert left node of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter value of left node of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            insert(sc, node.left);
        }

        System.out.println("Do you want to insert right node of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter value of right node of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            insert(sc, node.right);
        }
    }

    // Breadth wise traversal
    public void bfsTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        System.out.println();
        bfsTraversal(queue);
        System.out.println();
    }

    private void bfsTraversal(Queue<Node> queue) {
        if (queue.isEmpty()) {
            return;
        }
        Node node = queue.remove();
        System.out.print(node.value + "\t");
        if (node.left != null) {
            queue.add(node.left);
        }
        if (node.right != null) {
            queue.add(node.right);
        }

        bfsTraversal(queue);
    }

    // Display tree
    public void display() {
        display(root, 0);
    }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>" + node.value);

        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }
}
