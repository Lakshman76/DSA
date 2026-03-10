// 49. Group Anagrams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GropuAnagram {
    static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            // if key not present, create new list
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            // add word to the list
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    // optimized Solution
    static List<List<String>> groupAnagramsOptimised(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            // count frequency of each character
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            // build key from frequency array
            StringBuilder keyBuilder = new StringBuilder();
            for (int num : count) {
                keyBuilder.append(num).append('#');
            }

            String key = keyBuilder.toString();
            System.out.println(key);

            // insert into map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat", "mam", "mma" };
        List<List<String>> ans = groupAnagramsOptimised(strs);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
