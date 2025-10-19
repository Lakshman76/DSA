public class CountZero {
    static int countZero1(int n, int count) {
        if (n == 0)
            return count;
        else if (n % 10 == 0)
            count++;
        return countZero1(n / 10, count);
    }

    static int helper(int m) {
        if (m == 0)
            return 0;
        int count = 0;
        if (m % 10 == 0)
            count++;
        return count + helper(m / 10);
    }

    static int countZero2(int n) {
        if (n == 0)
            return 1;
        return helper(n);
    }

    public static void main(String[] args) {
        System.out.println(countZero2(10));
    }
}