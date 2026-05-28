// https://www.geeksforgeeks.org/problems/minimum-toogles-to-partition0135/1
public class MinToggle {
    static int minToggle(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        int[] suffix = new int[n + 1];
        prefix[0] = 0;
        suffix[n] = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
            if (arr[n - i - 1] == 0) {
                suffix[n - i - 1] = suffix[n - i] + 1;
            } else {
                suffix[n - i - 1] = suffix[n - i];
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            ans = Math.min(ans, prefix[i] + suffix[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 0, 0, 1, 1, 0, 1 };
        System.out.println(minToggle(arr));
    }
}
