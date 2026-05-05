import java.util.HashMap;

public class FirstNonRepeatingChar {
    static char firstChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        System.out.println(firstChar("aabccbd"));
    }
}
