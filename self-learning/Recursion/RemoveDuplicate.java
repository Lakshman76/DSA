public class RemoveDuplicate {

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            // duplicate
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[ch - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(ch), map);
        }
    }

    public static void main(String[] args) {
        String str = "aappnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
