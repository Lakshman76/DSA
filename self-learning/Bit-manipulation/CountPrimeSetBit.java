public class CountPrimeSetBit {
    // Prime Number of Set Bits in Binary Representation
    static int countPrimeSetBits(int left, int right) {
        int ans = 0;

        // constraints is - 10^6 = 2^20
        // Bitmask where prime positions are set to 1
        // Primes up to 20: 2,3,5,7,11,13,17,19
        int primeMask = 665772;
        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            if ((primeMask & (1 << bits)) != 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6, 10));
    }
}
