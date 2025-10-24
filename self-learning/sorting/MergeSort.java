import java.util.Arrays;

public class MergeSort {
    static int[] merge(int arr1[], int arr2[]) {
        int n = arr1.length - 1;
        int m = arr2.length - 1;
        int ans[] = new int[m + n + 2];
        int i = 0, j = 0, k = 0;
        while (i <= n && j <= m) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }
        while (i <= n) {
            ans[k++] = arr1[i++];
        }
        while (j <= m) {
            ans[k++] = arr2[j++];
        }
        return ans;
    }

    static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] nums = { 10, 2, 8, 5, 3, 4, 1, 7, 6, 9 };
        System.out.println(Arrays.toString(mergeSort(nums)));
    }
}
