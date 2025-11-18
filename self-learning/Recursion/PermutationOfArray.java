import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfArray {
    static List<List<Integer>> permutation(List<Integer> p, int[] up, int[] nums) {
        if (up.length == 0) {
            List<List<Integer>> li = new ArrayList<>();
            li.add(new ArrayList<>(p));
            return li;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= p.size(); i++) {
            // p.add(up[i]);
            p.add(i, up[0]);
            ans.addAll(permutation(p, Arrays.copyOfRange(up, 1, up.length), nums));
            p.remove(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> ans = permutation(new ArrayList<>(), nums, nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

    }
}
