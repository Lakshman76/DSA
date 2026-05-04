// https://www.geeksforgeeks.org/problems/palindrome-numbers0942/1
public class PalindromeBinary {
    static boolean isBinaryPalindrome(int n) {
        int totalBit = 0;
        int num = n;
        while (num != 0) {
            totalBit++;
            num >>= 1;
        }
        int left = totalBit - 1;
        int right = 0;
        while (right < left) {
            boolean leftBit = (n & (1 << left)) != 0;
            boolean rightBit = (n & (1 << right)) != 0;

            if (leftBit != rightBit) {
                return false;
            }
            left--;
            right++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBinaryPalindrome(7));
    }
}
