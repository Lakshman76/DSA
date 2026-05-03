// https://www.geeksforgeeks.org/problems/sort-by-set-bit-count1153/1

import java.util.ArrayList;

public class SortBySetBitCount {
    static int coutSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    static ArrayList<Integer> sortBySetBitCount(int[] arr) {
        // make 2d arraylist of size 32 of type array
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(32);
        for (int i = 0; i < 32; i++) {
            list.add(new ArrayList<>());
        }
        for (int num : arr) {
            // count no. of bits of each num and store num at that index(total count of
            // bits)
            int totalSetBit = coutSetBit(num);
            list.get(totalSetBit).add(num);
        }

        // store result
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 31; i >= 0; i--) {
            for (int num : list.get(i)) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 9, 4, 6, 7, 15, 32 };
        System.out.println(sortBySetBitCount(arr));
    }
}
