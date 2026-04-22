// 1545. Find Kth Bit in Nth Binary String

public class KthBit {
    static void invert(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
            } else {
                sb.setCharAt(i, '0');
            }
        }
    }

    static void reverse(StringBuilder sb) {
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }

    static StringBuilder generateBit(int n) {
        if (n == 1) {
            return new StringBuilder("0");
        }

        StringBuilder prev = generateBit(n - 1);

        // Make a copy of prev for processing
        StringBuilder copy = new StringBuilder(prev);

        // Invert the copy
        invert(copy);

        // Reverse the inverted copy
        reverse(copy);

        // Build final string: Sn-1 + "1" + reverse(invert(Sn-1))
        prev.append("1");
        prev.append(copy);

        return prev;
    }

    static char findKthBit(int n, int k) {
        StringBuilder ans = generateBit(n);
        return ans.charAt(k - 1);
    }

    public static void main(String[] args) {
        int n = 3, k = 1;
        System.out.println(findKthBit(n, k));
    }
}
