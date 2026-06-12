// https://www.geeksforgeeks.org/problems/check-if-a-string-is-repetition-of-its-substring-of-k-length3302/1

import java.util.HashMap;

public class KSubstr {
    static boolean kSubstr(String s, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        int i = 0;
        while (i < s.length()) {
            String substr = s.substring(i, i + k);
            map.put(substr, map.getOrDefault(substr, 0) + 1);
            if (map.size() > 2)
                return false;
            i += k;
        }

        if (map.size() == 1)
            return true;

        int ones = 0;
        for (int count : map.values()) {
            if (count == 1) {
                ones++;
            }
        }

        return ones >= 1;
    }

    public static void main(String[] args) {
        String s = "abcdabcd";
        int k = 2;
        System.out.println(kSubstr(s, k));
    }
}
