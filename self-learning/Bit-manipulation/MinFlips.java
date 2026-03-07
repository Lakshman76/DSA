// 1888. Minimum Number of Flips to Make the Binary String Alternating

public class MinFlips {

    // time - O(n)
    // space - O(n)
    static int minFlips(String s) {
        String window = s + s;

        // generate pattern
        StringBuilder ptrn1 = new StringBuilder(); // start with 0
        StringBuilder ptrn2 = new StringBuilder();// start with 1
        for (int i = 0; i < 2 * s.length(); i++) {
            if (i % 2 == 0) {
                ptrn1.append("0");
                ptrn2.append("1");
            } else {
                ptrn1.append("1");
                ptrn2.append("0");
            }
        }

        // using sliding window

        int low = 0;
        int high = 0;
        int p1 = 0;
        int p2 = 0;
        while (high < s.length()) {
            if (window.charAt(high) != ptrn1.charAt(high)) {
                p1++;
            }
            if (window.charAt(high) != ptrn2.charAt(high)) {
                p2++;
            }
            high++;
        }
        int ans = Math.min(p1, p2);
        // System.out.println(p1 + "\t" + p2);
        while (high < window.length() && low < s.length()) {
            if (window.charAt(low) != ptrn1.charAt(low))
                p1--;
            if (window.charAt(low) != ptrn2.charAt(low))
                p2--;

            if (window.charAt(high) != ptrn1.charAt(high))
                p1++;
            if (window.charAt(high) != ptrn2.charAt(high))
                p2++;

            ans = Math.min(ans, Math.min(p1, p2));
            low++;
            high++;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minFlips("01001001101"));
    }
}
