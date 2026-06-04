// https://www.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string4111/1

public class MaxZeroSubStr {
    static int maxSubstring(String s) {
        int ans = Integer.MIN_VALUE;
        int count = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                if (count == -1)
                    count = 1;
                else
                    count++;
            } else if (count != -1) {
                count--;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "111000110000";
        System.out.println(maxSubstring(s));
    }
}
