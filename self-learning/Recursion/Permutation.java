import java.util.ArrayList;

public class Permutation {
    static void permutations(String sub, String str) {
        if (str.isEmpty()) {
            System.out.println(sub);
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= sub.length(); i++) {
            String f = sub.substring(0, i);
            String l = sub.substring(i, sub.length());
            permutations(f + ch + l, str.substring(1));
        }
    }

    static ArrayList<String> permutationList(String sub, String str) {
        if (str.isEmpty()) {
            ArrayList<String> li = new ArrayList<>();
            li.add(sub);
            return li;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = str.charAt(0);
        for (int i = 0; i <= sub.length(); i++) {
            String f = sub.substring(0, i);
            String l = sub.substring(i, sub.length());
            ans.addAll(permutationList(f + ch + l, str.substring(1)));
        }
        return ans;
    }

    static int countPermutation(String sub, String str) {
        if (str.isEmpty()) {
            return 1;
        }
        char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i <= sub.length(); i++) {
            String f = sub.substring(0, i);
            String l = sub.substring(i, sub.length());
            count += countPermutation(f + ch + l, str.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        permutations("", "abc");
    }
}
