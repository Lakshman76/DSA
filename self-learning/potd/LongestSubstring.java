// https://www.geeksforgeeks.org/problems/longest-repeating-character-replacement/1

public class LongestSubstring {
    static int find(int[] freq) {
        int max = freq[0];

        for (int i = 1; i < freq.length; i++) {
            max = Math.max(max, freq[i]);
        }

        return max;
    }

    static int longestSubstr(String s, int k) {
        int longest = 0;
        int[] freq = new int[26];
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            // map.put(ch, map.getOrDefault(ch, 0) + 1);
            freq[ch - 'A']++;
            int wSize = right - left + 1;
            int maxFreq = find(freq);
            while (wSize - maxFreq > k) {
                char lch = s.charAt(left);
                freq[lch - 'A']--;
                left++;
                wSize = right - left + 1;
                maxFreq = find(freq);
            }
            longest = Math.max(longest, wSize);
        }
        return longest;
    }

    public static void main(String[] args) {
        String s = "UXWHMSNCBXCOKSFZKVAT";
        int k = 7;
        System.out.println(longestSubstr(s, k));
    }
}
