import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.tree.TreeNode;

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

    // store each level in a list

    public void levelOrder() {
        List<List<Integer>> result = new ArrayList<>();
        result = levelOrder(root);

        for (List<Integer> list : result) {
            System.out.print(list + "\t");
        }
    }

    private List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int qSize = queue.size();
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < qSize; i++) {
                Node node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                li.add(node.value);
            }
            result.add(li);
        }
        return result;
    }

    // find average of each level
    public void averageOfLevels() {
        List<Double> result = averageOfLevels(root);
        System.out.println(result);
    }

    private List<Double> averageOfLevels(Node root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int qSize = queue.size();
            double avg = 0.0;
            for (int i = 0; i < qSize; i++) {
                Node node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                avg += node.value;
            }
            avg /= qSize;
            result.add(avg);
        }
        return result;
    }

    // Find the next successor
    public void findSuccessor() {
        Node node = findSuccessor(root, 20);
        if (node != null) {
            System.out.println(node.value);
        } else {
            System.out.println("Empty");
        }
    }

    private Node findSuccessor(Node root, int key) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.value == key) {
                break;
            }

        }
        return queue.peek();
    }

    // Store tree in zig-zag order
    public void zigzagLevelOrder() {
        List<List<Integer>> result = new ArrayList<>();
        result = zigzagLevelOrder(root);

        for (List<Integer> list : result) {
            System.out.print(list + "\t");
        }
    }

    private List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        boolean isRev = false;

        while (!deque.isEmpty()) {
            int qSize = deque.size();
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < qSize; i++) {
                if (isRev) {
                    Node node = deque.removeLast();
                    if (node.right != null) {
                        deque.addFirst(node.right);
                    }
                    if (node.left != null) {
                        deque.addFirst(node.left);
                    }
                    li.add(node.value);
                } else {
                    Node node = deque.remove();
                    if (node.left != null) {
                        deque.add(node.left);
                    }
                    if (node.right != null) {
                        deque.add(node.right);
                    }
                    li.add(node.value);
                }
            }
            isRev = !isRev;
            result.add(li);
        }
        return result;
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
