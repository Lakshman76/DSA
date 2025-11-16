import java.util.ArrayList;
import java.util.List;

public class Combinations {
    static List<List<Integer>> combine(int p, List<Integer> el, int n, int k) {
        if (el.size() == k) {
            List<List<Integer>> li = new ArrayList<>();
            li.add(new ArrayList<>(el));
            return li;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = p; i < n; i++) {
            el.add(i + 1);
            ans.addAll(combine(i + 1, el, n, k));
            el.remove(el.size() - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        // combine(4, 2);
        List<List<Integer>> ans = combine(0, new ArrayList<>(), 4, 2);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

    }
}
