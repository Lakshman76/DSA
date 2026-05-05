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

    public static void main(String[] args) {
        int[] arr = { 7, 3, 5 };
        System.out.println(sumXOR(arr));
    }
}
