// https://www.geeksforgeeks.org/problems/max-consecutive-one/1

public class MaxConsecutiveBit {
    static int maxConsecBits(int[] arr) {
        int low = 0;
        int high = 0;
        int max1 = 0;
        while (high < arr.length) {
            if (arr[high] == 1) {
                max1 = Math.max(max1, high - low + 1);
                high++;
            } else {
                high++;
                low = high;
            }
        }
        low = 0;
        high = 0;
        int max0 = 0;
        while (high < arr.length) {
            if (arr[high] == 0) {
                max0 = Math.max(max0, high - low + 1);
                high++;
            } else {
                high++;
                low = high;
            }
        }
        return Math.max(max0, max1);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 0, 1, 0 };
        System.out.println(maxConsecBits(arr));
    }
}
