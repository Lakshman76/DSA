import java.util.Scanner;

public class DFS {
    private static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    private TreeNode root;

    // Insert Element
    public void insert(Scanner sc) {
        System.out.println("Enter the root node: ");
        int value = sc.nextInt();
        root = new TreeNode(value);
        insert(sc, root);
    }

    private void insert(Scanner sc, TreeNode node) {
        System.out.println("Do you want to insert left node of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter value of left node of " + node.value);
            int value = sc.nextInt();
            node.left = new TreeNode(value);
            insert(sc, node.left);
        }

        System.out.println("Do you want to insert right node of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter value of right node of " + node.value);
            int value = sc.nextInt();
            node.right = new TreeNode(value);
            insert(sc, node.right);
        }
    }

    // find Diameter of Binary Tree
    public void diameterOfBinaryTree() {
        System.out.println("Diameter: " + diameterOfBinaryTree(root));
    }

    int diameter = 0;

    private int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int d = leftHeight + rightHeight + 1;
        diameter = Math.max(d, diameter);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Invert binary tree
    public void invertTree() {
        root = invertTree(root);
        System.out.println("*********After invert the tree look like*************** ");
        display();
    }

    private TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    // Display tree
    public void display() {
        display(root, 0);
    }

    private void display(TreeNode node, int level) {
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
