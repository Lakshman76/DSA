public class HappyNumber {
    static int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        } while (slow != fast);

        if (slow == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(5));
    }
}
