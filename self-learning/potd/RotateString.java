// 796. Rotate String

public class RotateString {
    static boolean rotateString(String s, String goal) {
        if (s.equals(goal)) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.equals(goal)) {
                return true;
            }
            s = s.substring(1) + s.charAt(0);
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde", goal = "abced";
        System.out.println(rotateString(s, goal));
    }
}
