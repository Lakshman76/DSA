import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    static List<List<Integer>> find(List<Integer> sub, int[] nums) {
        if (nums.length == 0) {
            List<List<Integer>> li = new ArrayList<>();
            li.add(new ArrayList<>(sub));
            return li;
        }
        sub.add(nums[0]);
        List<List<Integer>> left = find(sub, Arrays.copyOfRange(nums, 1, nums.length));
        sub.remove(sub.size() - 1);
        List<List<Integer>> right = find(sub, Arrays.copyOfRange(nums, 1, nums.length));
        left.addAll(right);
        return left;
    }

    public List<List<Integer>> subsets(int[] nums) {
        return find(new ArrayList<>(), nums);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> ans = find(new ArrayList<>(), nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
