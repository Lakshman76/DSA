// https://www.geeksforgeeks.org/problems/equal-to-product3836/1

import java.util.HashSet;

public class ProductPair {

    static boolean isProduct(int[] arr, long target) {
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (target == 0 && !set.isEmpty()) {
                    return true;
                }
            } else {
                if (target % arr[i] == 0) {
                    long q = target / arr[i];
                    if (set.contains(q)) {
                        return true;
                    }
                }
            }

            set.add((long) arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 0, 0, 0 };
        long target = 0;
        System.out.println(isProduct(arr, target));
    }
}
