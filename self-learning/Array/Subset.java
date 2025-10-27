import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    static List<List<Integer>> subSet(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : nums) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subSetWithDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int n = outer.size();
            int start = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = n / 2;
            }
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3 };
        List<List<Integer>> ans = subSetWithDuplicates(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
