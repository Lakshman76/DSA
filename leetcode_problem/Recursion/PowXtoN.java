// Question link - https://leetcode.com/problems/powx-n/

// Solution - 

class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 1 / (myPow(x, Integer.MAX_VALUE) * x);
            }
            return 1 / myPow(x, -n);
        }
        double halfPower = myPow(x, n / 2);
        double halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
}