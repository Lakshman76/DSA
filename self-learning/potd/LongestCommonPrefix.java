// 3043. Find the Length of the Longest Common Prefix

public class LongestCommonPrefix {

    static int commonLength(String s1, String s2) {
        int len = 0;
        int first = 0;
        int second = 0;
        while (first < s1.length() && second < s2.length()) {
            if (s1.charAt(first) == s2.charAt(second)) {
                len++;
            } else {
                break;
            }
            first++;
            second++;
        }
        return len;
    }

    static int longestCommonPrefix(int[] arr1, int[] arr2) {
        int ans = 0;
        for (int i = 0; i < arr1.length; i++) {
            String s1 = Integer.toString(arr1[i]);
            for (int j = 0; j < arr2.length; j++) {
                String s2 = Integer.toString(arr2[j]);
                ans = Math.max(ans, commonLength(s1, s2));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 10, 100 };
        int[] arr2 = { 1000 };
        System.out.println(longestCommonPrefix(arr1, arr2));
    }
}
