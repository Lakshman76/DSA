// 2196 Create Binary Tree from Descriptions

import java.util.HashMap;
import java.util.HashSet;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BTFromDescription {
    static TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < descriptions.length; i++) {
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            int pos = descriptions[i][2];

            set.add(child);

            TreeNode parentNode = map.get(parent);

            if (parentNode == null) {
                parentNode = new TreeNode(parent);
            }
            TreeNode childNode = map.get(child);
            if (childNode == null) {
                childNode = new TreeNode(child);
            }
            map.put(child, childNode);
            if (pos == 1)
                parentNode.left = childNode;
            else
                parentNode.right = childNode;
            map.put(parent, parentNode);
        }
        for (int key : map.keySet()) {
            if (!set.contains(key)) {
                return map.get(key);
            }
        }
        return null;
    }

    static void prettyDisplay(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>" + node.val);

        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        int[][] descriptions = { { 20, 15, 1 }, { 20, 17, 0 }, { 50, 20, 1 }, { 50, 80, 0 }, { 80, 19, 1 } };
        TreeNode node = createBinaryTree(descriptions);
        prettyDisplay(node, 0);
    }
}
