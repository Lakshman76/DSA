// 1888. Minimum Number of Flips to Make the Binary String Alternating

public class MinFlips {

    // time - O(n)
    // space - O(1)
    static int minFlips(String s) {
        int n = s.length();
        int p1 = 0; // mismatches with pattern starting with 0
        int p2 = 0; // mismatches with pattern starting with 1
        int ans = Integer.MAX_VALUE;

        int low = 0;

        for (int high = 0; high < 2 * n; high++) {

            char ch = s.charAt(high % n);

            char expected1 = (high % 2 == 0) ? '0' : '1';
            char expected2 = (high % 2 == 0) ? '1' : '0';

            if (ch != expected1)
                p1++;
            if (ch != expected2)
                p2++;

            if (high - low + 1 > n) {
                char leftChar = s.charAt(low % n);

                char exp1 = (low % 2 == 0) ? '0' : '1';
                char exp2 = (low % 2 == 0) ? '1' : '0';

                if (leftChar != exp1)
                    p1--;
                if (leftChar != exp2)
                    p2--;

                low++;
            }

            if (high - low + 1 == n) {
                ans = Math.min(ans, Math.min(p1, p2));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minFlips("01001001101"));
    }
}
