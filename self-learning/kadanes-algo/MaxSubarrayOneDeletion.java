// 1186. Maximum Subarray Sum with One Deletion

public class MaxSubarrayOneDeletion {
    static int maximumSum(int[] arr) {
        int result = 0;
        int noDel = arr[0];
        int oneDel = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int prevNoDel = noDel;
            int prevOneDel = oneDel;
            noDel = Math.max(prevNoDel + arr[i], arr[i]);

            int val;
            if (prevOneDel == Integer.MIN_VALUE) {
                val = arr[i];
            } else {
                val = prevOneDel + arr[i];
            }

            oneDel = Math.max(val, prevNoDel);

            result = Math.max(result, Math.max(oneDel, noDel));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 0, 3 };
        System.out.println(maximumSum(arr));
    }
}
