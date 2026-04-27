// https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1

import java.util.HashMap;

public class SmallestSubstring {
    static int smallestSubstring(String s) {
        int min = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.size() == 3) {
                min = Math.min(min, right - left + 1);
                char lch = s.charAt(left);
                map.put(lch, map.get(lch) - 1);
                if (map.get(lch) == 0) {
                    map.remove(lch);
                }
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        String s = "10022222212";
        System.out.println(smallestSubstring(s));
    }
}
