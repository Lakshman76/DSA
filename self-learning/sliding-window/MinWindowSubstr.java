// 76. Minimum Window Substring
public class MinWindowSubstr {
    static boolean isPresent(int[] tArr, int[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            if (tArr[i] > sArr[i])
                return false;
        }
        return true;
    }

    static String minWindow(String s, String t) {
        int[] tArr = new int[255];
        for (int i = 0; i < t.length(); i++) {
            tArr[t.charAt(i)]++;
        }
        String result = "";
        int min = Integer.MAX_VALUE;
        int[] sArr = new int[255];
        int low = 0;
        for (int high = 0; high < s.length(); high++) {
            sArr[s.charAt(high)]++;

            while (isPresent(tArr, sArr)) {
                if (high - low + 1 < min) {
                    min = high - low + 1;
                    result = s.substring(low, high + 1);
                }
                sArr[s.charAt(low)]--;
                low++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String s = "cabwefgewcwaefgcf", t = "cae";
        System.out.println(minWindow(s, t));
    }
}
