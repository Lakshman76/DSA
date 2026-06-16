// https://www.geeksforgeeks.org/problems/stickler-theif-1587115621/1

public class SticklerThief {
    static int dp(int i, int[] arr, int[] memo) {
        if (i == 0) {
            return arr[0];
        }
        if (i == 1) {
            return Math.max(arr[0], arr[1]);
        }
        if (memo[i] != 0) {
            return memo[i];
        }
        memo[i] = Math.max(arr[i] + dp(i - 2, arr, memo), dp(i - 1, arr, memo));
        return memo[i];
    }

    static int findMaxSumdp(int arr[]) {
        int [] memo = new int[arr.length];
        return dp(arr.length - 1, arr, memo);
    }

    static int findMaxSum(int arr[]) {
        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int curr = Math.max(arr[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 13, 9, 6, 9, 7, 7};
        System.out.println(findMaxSum(arr));
    }
}
