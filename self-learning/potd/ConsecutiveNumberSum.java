// https://www.geeksforgeeks.org/problems/consecutive-numbers-for-sum3132/1
public class ConsecutiveNumberSum {
    static boolean isSumOfConsecutive(int n) {
        if (n <= 2) {
            return false;
        }
        int left = 1;
        int sum = 0;
        for (int i = 1; i <= n / 2 + 1; i++) {
            sum += i;
            while (sum > n) {
                sum -= left;
                left++;
            }
            if (sum == n)
                return true;
        }
        return false;
    }

    static boolean isSumOfConsecutiveOptimized(int n) {
        if ((n & (n - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSumOfConsecutiveOptimized(15));
    }
}
