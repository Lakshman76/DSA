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
        System.out.println("*********After invert, The tree look like*************** ");
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

    // Find max depth of Binart Tree
    public void maxDepth() {
        System.out.println("Max Depth: " + maxDepth(root));
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    // Convert sorted array into Binary Search Tree

    public TreeNode sortedArrayToBST(int[] nums) {
        populateSorted(nums, 0, nums.length);
        return root;
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        root = insert(nums[mid], root);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    private TreeNode insert(int value, TreeNode node) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        } else {
            node.right = insert(value, node.right);
        }
        return node;
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
