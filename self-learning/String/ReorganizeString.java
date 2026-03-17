// 767. Reorganize String

import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeString {
    static String reorganizeString(String s) {
        // store freqency og each character
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(i)));
        }
        if (maxFreq > (s.length() + 1) / 2)
            return "";

        // store like (char, freq) in heap -> sort according to freq.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (char ch : map.keySet()) {
            pq.offer(new int[] { ch, map.get(ch) });
        }
        StringBuilder ans = new StringBuilder();
        while (pq.size() > 1) {
            int[] first = pq.poll();
            int[] second = pq.poll();

            ans.append((char) first[0]);
            ans.append((char) second[0]);

            first[1]--;
            second[1]--;

            if (first[1] > 0)
                pq.offer(first);
            if (second[1] > 0)
                pq.offer(second);
        }
        if (!pq.isEmpty()) {
            int[] last = pq.poll();
            if (last[1] > 1)
                return "";
            ans.append((char) (last[0]));
        }
        return ans.toString();
    }

    // without Hashmap -> using array
    static String reOrganizeStr(String s) {
        // Count frequency
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // store like (char, freq) in heap -> sort according to freq.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.offer(new int[] { i, freq[i] });
            }
        }
        StringBuilder ans = new StringBuilder();
        while (pq.size() > 1) {
            int[] first = pq.poll();
            int[] second = pq.poll();

            ans.append((char) (first[0] + 'a'));
            ans.append((char) (second[0] + 'a'));

            first[1]--;
            second[1]--;

            if (first[1] > 0)
                pq.offer(first);
            if (second[1] > 0)
                pq.offer(second);
        }
        // Handle last remaining character
        if (!pq.isEmpty()) {
            int[] last = pq.poll();
            if (last[1] > 1)
                return "";
            ans.append((char) (last[0] + 'a'));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbcc";
        System.out.println(reorganizeString(s));

    }
}
