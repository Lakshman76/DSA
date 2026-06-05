// https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

import java.util.Arrays;

public class CountTriplets {
    static int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int totalCount = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int tempSum = arr[i] + arr[start] + arr[end];
                if (tempSum < sum) {
                    totalCount++;
                    totalCount += (end - start - 1);
                    start++;
                } else {
                    end--;
                }
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        int sum = 2;
        int[] arr = { -2, 0, 1, 3 };
        System.out.println(countTriplets(sum, arr));
    }
}
