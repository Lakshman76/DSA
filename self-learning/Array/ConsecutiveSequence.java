
// 128. Longest Consecutive Sequence
import java.util.HashSet;

public class ConsecutiveSequence {
    static int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 0;
                int j = num;
                while (set.contains(j)) {
                    count++;
                    j++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println(longestConsecutive(nums));
    }
}