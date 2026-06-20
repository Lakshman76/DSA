// https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1

public class LastDigitApowerB {
    static int getLastDigit(String a, String b) {
        if (b.equals("0")) {
            return 1;
        }
        int[] powerCount = { 1, 1, 4, 4, 2, 1, 1, 4, 4, 2 };
        int lastDigitA = a.charAt(a.length() - 1) - '0';
        int cycleLength = powerCount[lastDigitA];
        int idx = 0;
        int rem = 0;
        while (idx < b.length()) {
            int digit = b.charAt(idx) - '0';
            rem = (rem * 10 + digit) % cycleLength;
            idx++;
        }

        if (rem == 0) {
            rem = cycleLength;
        }

        int ans = 1;
        for (int i = 0; i < rem; i++) {
            ans = (ans * lastDigitA) % 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        String a = "10", b = "3";
        System.out.println(getLastDigit(a, b));
    }
}
