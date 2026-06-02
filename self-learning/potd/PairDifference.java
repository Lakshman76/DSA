
// https://www.geeksforgeeks.org/problems/pairs-with-specific-difference1533/1
import java.util.Arrays;

public class PairDifference {
    static int sumDiffPairs(int[] arr, int k) {
        Arrays.sort(arr);
        int j = arr.length - 1;
        int i = j - 1;
        int result = 0;
        while (i >= 0) {
            if (arr[j] - arr[i] < k) {
                result += (arr[j] + arr[i]);
                j -= 2;
                i = j - 1;
            } else {
                j--;
                i--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 15, 10, 300 };
        int k = 12;
        System.out.println(sumDiffPairs(arr, k));
    }
}
