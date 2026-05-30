// 80. Remove Duplicates from Sorted Array II
public class TwoUnique {
    static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[first] != nums[second] || nums[second] != nums[i]) {
                nums[second + 1] = nums[i];
                second++;
                first++;
            }
        }
        return second + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 2 };
        System.out.println(removeDuplicates(nums));
    }
}
