import java.util.Arrays;

public class QuickSort {
    static int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int pIdx = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] <= pivot) {
                pIdx++;
                if (pIdx != i) {
                    int temp = nums[pIdx];
                    nums[pIdx] = nums[i];
                    nums[i] = temp;

                }
            }
        }
        nums[start] = nums[pIdx];
        nums[pIdx] = pivot;
        return pIdx;
    }

    static void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIdx = partition(nums, start, end);
        quickSort(nums, start, pivotIdx - 1);
        quickSort(nums, pivotIdx + 1, end);
    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 5, 10, 12, 2, 9, 10, 8, 7, 4 };
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
