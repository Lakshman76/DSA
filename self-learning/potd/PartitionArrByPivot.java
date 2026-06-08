// 2161. Partition Array According to Given Pivot

import java.util.Arrays;

public class PartitionArrByPivot {
    static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        Arrays.fill(result, pivot);

        int start = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot) result[start++] = nums[i];
        }

        int end = nums.length - 1;
        for(int i = end; i >= 0; i--) {
            if(nums[i] > pivot) result[end--] = nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        nums = pivotArray(nums, pivot);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
}
