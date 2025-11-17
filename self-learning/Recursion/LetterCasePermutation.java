import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    static List<String> letterCasePermutation(String p, String up, String s) {
        if (up.isEmpty()) {
            List<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        List<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        if (ch >= '0' && ch <= '9') {
            ans.addAll(letterCasePermutation(p + ch, up.substring(1), s));
        } else {
            ans.addAll(letterCasePermutation(p + Character.toLowerCase(ch), up.substring(1), s));
            ans.addAll(letterCasePermutation(p + Character.toUpperCase(ch), up.substring(1), s));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(letterCasePermutation("", "A1b2", "A1b2"));
    }
}
