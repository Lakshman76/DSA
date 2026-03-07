// 1888. Minimum Number of Flips to Make the Binary String Alternating

public class MinFlips {
    static int findMin(StringBuilder sb, int start, int end) {
        int ptrn1 = 0; // start with 0
        int ptrn2 = 0; // start with 1
        int idx = 0;
        for (int i = start; i < end; i++) {
            char ch = sb.charAt(i);
            char expected1 = idx % 2 == 0 ? '0' : '1';
            char expected2 = idx % 2 == 0 ? '1' : '0';

            if (ch != expected1)
                ptrn1++;
            if (ch != expected2)
                ptrn2++;
            idx++;
        }
        return Math.min(ptrn1, ptrn2);
    }

    static int minFlips(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(s);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int val = findMin(sb, i, s.length() + i);
            System.out.println(val);
            ans = Math.min(ans, val);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minFlips("01001001101"));
    }
}
