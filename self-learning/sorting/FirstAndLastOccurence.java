import java.util.Arrays;

public class FirstAndLastOccurence {
    static int find(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isFirst) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }

    static int[] firstAndLastOccurence(int[] nums, int target) {
        int first = find(nums, target, false);
        int last = find(nums, target, true);
        int ans[] = { first, last };
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 6, 6, 7 };
        System.out.println(Arrays.toString(firstAndLastOccurence(nums, 8)));
    }
}
