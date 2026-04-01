// 1004. Max Consecutive Ones III

public class MaxOnesIII {
    static int longestOnes(int[] nums, int k) {
        int result = 0;

        int low = 0;
        int oneCount = 0;
        int zeroCount = 0;
        for (int high = 0; high < nums.length; high++) {
            if (nums[high] == 1)
                oneCount++;
            else
                zeroCount++;

            while (zeroCount > k) {
                if (nums[low] == 1)
                    oneCount--;
                else
                    zeroCount--;

                low++;
            }

            result = Math.max(result, oneCount + zeroCount);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
