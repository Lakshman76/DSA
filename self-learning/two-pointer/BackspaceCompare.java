// 844. Backspace String Compare

public class BackspaceCompare {
    static String processString(String str) {
        StringBuilder sb = new StringBuilder();
        int last = str.length() - 1;
        int skip = 0;
        while (last >= 0) {
            if (str.charAt(last) == '#') {
            skip++;
            last--;
        } else if (skip > 0) {
            skip--;
            last--;
        } else {
            sb.append(str.charAt(last));
            last--;
        }
        }
        return sb.toString();
    }

    static boolean backspaceCompare(String s, String t) {
        String str1 = processString(s);
        System.out.println(str1);
        String str2 = processString(t);
        System.out.println(str2);

        return str1.equals(str2);
    }

    public static void main(String[] args) {
        String s = "ab##c";
        String t = "c#d#ef##c";
        System.out.println(backspaceCompare(s, t));
    }
}
