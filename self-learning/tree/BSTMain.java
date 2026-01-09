public class BSTMain {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        BST tree = new BST();
        tree.populate(nums);
        tree.display();

        System.out.println("\n************Sorted*******************\n");
        BST tree2 = new BST();
        int[] sorted = { 1, 2, 3, 4, 5, 6, 7 };
        tree2.populateSorted(sorted);
        tree2.display();
    }
}
