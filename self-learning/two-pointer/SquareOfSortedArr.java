// 977. Squares of a Sorted Array

public class SquareOfSortedArr {
    static int[] sortedSquares(int[] nums) {
        int start = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                start++;
            } else {
                break;
            }
        }
        int end = start + 1;
        int[] ans = new int[nums.length];
        int k = 0;
        while (start >= 0 && end < nums.length) {
            if (Math.abs(nums[start]) <= nums[end]) {
                ans[k++] = nums[start] * nums[start];
                start--;
            } else {
                ans[k++] = nums[end] * nums[end];
                end++;
            }
        }
        while (start >= 0) {
            ans[k++] = nums[start] * nums[start];
            start--;
        }
        while (end < nums.length) {
            ans[k++] = nums[end] * nums[end];
            end++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -2, -1, 0, 3, 10 };
        int[] ans = sortedSquares(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
