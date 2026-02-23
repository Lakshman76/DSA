import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        String s = "00110110";
        int k = 2;
        System.out.println(hasAllCodes(s, k));
    }
}
