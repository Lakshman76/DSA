import java.util.Arrays;

public class IsFoundArr {
    static boolean isFoundTarget(int[] arr, int target) {
        if (arr.length == 0)
            return false;
        if (arr[0] == target)
            return true;
        return isFoundTarget(Arrays.copyOfRange(arr, 1, arr.length), target);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 3, 4, 5, 6, 4 };
        int target = 7;
        System.out.println(isFoundTarget(arr, target));
    }
}
