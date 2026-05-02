// https://www.geeksforgeeks.org/problems/find-position-of-set-bit3706/1
public class SetBitPos {
    static int findPosition(int n) {
        int setBitPos = -1;
        int idx = 1;
        boolean isSet = false;
        while (n > 0) {
            if ((n & 1) != 0) {
                if (!isSet) {
                    setBitPos = idx;
                    isSet = true;
                } else {
                    return -1;
                }
            }
            idx++;
            n >>= 1;
        }
        return setBitPos;
    }

    static int findPositionOptimized(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return Integer.numberOfTrailingZeros(n) + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findPositionOptimized(n));
    }
}
