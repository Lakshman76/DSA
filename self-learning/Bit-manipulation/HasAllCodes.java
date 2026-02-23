import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasAllCodes {

    // Check If a String Contains All Binary Codes of Size K
    public static boolean hasAllCodes(String s, int k) {
        List<String> combination = findKCombination(k, new ArrayList<String>(), "");

        for (String str : combination) {
            if (!s.contains(str)) {
                return false;
            }
        }
        return true;
    }

    static List<String> findKCombination(int k, List<String> list, String str) {
        if (k == 0) {
            list.add(str);
            return list;
        }
        findKCombination(k - 1, list, str + "0");
        findKCombination(k - 1, list, str + "1");

        return list;
    }

    // Optimized way to solve

    public static boolean hasAllCodesOptimized(String s, int k) {
        int n = s.length();

        // total possible combination is less than 2 ^ k
        if (n - k + 1 < (1 << k)) {
            return false;
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i <= n - k; i++) {
            set.add(s.substring(i, i + k));
        }

        return set.size() == (1 << k);
    }

    public static void main(String[] args) {
        String s = "00110110";
        int k = 2;
        System.out.println(hasAllCodes(s, k));

        System.out.println(hasAllCodesOptimized(s, k));
    }
}
