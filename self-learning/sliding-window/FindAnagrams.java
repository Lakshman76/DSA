
// 438. Find All Anagrams in a String
import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {
    static boolean checkAnagram(int[] sArr, int[] pArr) {
        for (int i = 0; i < 26; i++) {
            if (pArr[i] != sArr[i])
                return false;
        }
        return true;
    }

    static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();

        int[] pArr = new int[26];
        int n = p.length();
        for (int i = 0; i < n; i++) {
            pArr[p.charAt(i) - 'a']++;
        }

        int[] sArr = new int[26];
        int low = 0;
        for (int high = 0; high < s.length(); high++) {
            sArr[s.charAt(high) - 'a']++;
            if (high - low + 1 > n) {
                sArr[s.charAt(low) - 'a']--;
                low++;
            }

            if (high - low + 1 == n && checkAnagram(sArr, pArr)) {
                result.add(low);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abab", p = "ab";
        System.out.println(findAnagrams(s, p));
    }
}
