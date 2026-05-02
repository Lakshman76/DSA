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

    public static void main(String[] args) {
        int n = 8;
        System.out.println(findPosition(n));
    }
}
