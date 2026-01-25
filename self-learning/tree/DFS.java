import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

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

    // Flatten Binary Tree to Linked List
    // Time and space O(n)

    public void flatten() {
        flatten(root);
    }

    Queue<TreeNode> queue = new LinkedList<>();

    private void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        addIntoQ(root);
        TreeNode node = queue.poll();
        TreeNode temp = node;
        while (!queue.isEmpty()) {
            temp.left = null;
            temp.right = queue.poll();

            temp = temp.right;
        }
    }

    private void addIntoQ(TreeNode node) {
        if (node == null) {
            return;
        }
        queue.offer(node);
        addIntoQ(node.left);
        addIntoQ(node.right);
    }

    // Flatten Binary Tree to Linked List --- Optimized
    // Time - O(n) space - O(1)
    public void flattenOptimized() {
        System.out.println("**********************Flatten Binary Tree****************");
        flattenOptimized(root);
        display();
    }

    private void flattenOptimized(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode temp = curr.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    // Validate Binary Search Tree

    public void isValidBST() {
        System.out.println(isValidBST(root));
    }

    private boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }

        if (low != null && node.value <= low) {
            return false;
        }

        if (high != null && node.value >= high) {
            return false;
        }

        boolean isLeftCorrect = helper(node.left, low, node.value);
        boolean isRighttCorrect = helper(node.right, node.value, high);

        return isLeftCorrect && isRighttCorrect;
    }

    // Lowest Common Ancestor of a Binary Tree
    public void lowestCommonAncestor() {
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        TreeNode ans = lowestCommonAncestor(root, p, q);

        System.out.println(ans);
    }

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
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
