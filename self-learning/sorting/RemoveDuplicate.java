import java.util.Arrays;

public class RemoveDuplicate {
    static int[] removeDuplicate(int[] nums) {
        // int i = 1;
        // int j = nums.length - 1;
        // while (i < j) {
        // if (nums[i - 1] == nums[i]) {
        // int temp = nums[j];
        // nums[j] = nums[i];
        // nums[i] = temp;
        // j--;
        // }
        // i++;
        // }
        // return Arrays.copyOfRange(nums, 0, i);

        // Return sorted array
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 3, 4, 5, 5, 6, 7 };
        System.out.println(Arrays.toString(removeDuplicate(nums)));
    }
}
