import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MergeAdjacent {
    public static List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack = new Stack<>();

        for (int num : nums) {
            long curr = num;

            while (!stack.isEmpty() && stack.peek() == curr) {
                curr += stack.pop();
            }
            stack.push(curr);
        }
        return new ArrayList<>(stack);
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 1, 1, 2 }; // [3, 4]
        int[] nums = { 4, 2, 2 }; // [8]

        System.out.println(mergeAdjacent(nums));
    }
}
