// Convert unsorted array into max heap

import java.util.ArrayList;

public class Max_heap {
    ArrayList<Integer> list;

    public Max_heap(int[] nums) {
        list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
    }

    private void swap(int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    public ArrayList<Integer> maxHeap(int index) {
        if (index < 0) {
            System.out.println("Empty list");
            return list;
        }
        for (int i = index; i >= 0; i--) {
            downheap(i);
        }

        return list;
    }

    private void downheap(int index) {
        int max = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(max).compareTo(list.get(left)) < 0) {
            max = left;
        }

        if (right < list.size() && list.get(max).compareTo(list.get(right)) < 0) {
            max = right;
        }

        if (max != index) {
            swap(index, max);
            downheap(max);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 1, 9, 15, 17, 5, 7, 20, 12, 3, 4 };
        Max_heap heap = new Max_heap(arr);
        int index = (arr.length - 1) / 2;
        System.out.println(heap.maxHeap(index));
    }
}
