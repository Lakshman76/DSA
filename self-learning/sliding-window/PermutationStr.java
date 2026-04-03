// 567. Permutation in String

public class PermutationStr {
    static boolean checkPermutation(int[] s2Arr, int[] s1Arr) {
        for (int i = 0; i < 26; i++) {
            if (s1Arr[i] != s2Arr[i])
                return false;
        }
        return true;
    }

    static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        if (n > s2.length())
            return false;

        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for (int i = 0; i < n; i++) {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }

        if (checkPermutation(s2Arr, s1Arr))
            return true;

        int low = 0;
        for (int high = n; high < s2.length(); high++) {
            s2Arr[s2.charAt(high) - 'a']++;
            if (high - low + 1 > n) {
                s2Arr[s2.charAt(low) - 'a']--;
                low++;
            }

            if (high - low + 1 == n && checkPermutation(s2Arr, s1Arr)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }
}
