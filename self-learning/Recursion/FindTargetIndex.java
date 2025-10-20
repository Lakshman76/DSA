import java.util.ArrayList;
import java.util.List;

public class FindTargetIndex {
    static int findTargetIndex(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        return findTargetIndex(arr, target, index + 1);
    }

    static List<Integer> findAllIndex(int[] arr, int target, int index) {
        List<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);
        list.addAll(findAllIndex(arr, target, index + 1));
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 2, 3, 5, 4, 6 };
        int target = 2;
        System.out.println(findAllIndex(arr, target, 0));
    }
}
