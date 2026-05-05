// https://www.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1

public class SumOfXor {
    static long sumXOR(int[] arr) {
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ans += (arr[i] ^ arr[j]);
            }
        }
        return ans;
    }

    static long sumXOROptimized(int[] arr) {
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            int countOne = 0;
            int countZero = 0;
            int bitMask = 1 << i;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & bitMask) == 0) {
                    countZero++;
                } else {
                    countOne++;
                }
            }
            ans += (long) countZero * countOne * (1 << i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 5 };
        System.out.println(sumXOROptimized(arr));
    }
}
