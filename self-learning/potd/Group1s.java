// https://www.geeksforgeeks.org/problems/minimum-swaps-required-to-group-all-1s-together2451/1
public class Group1s {
    static int count1(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;
            }
        }
        return count;
    }

    static int minSwaps(int[] arr) {
        int total1 = count1(arr);
        if (total1 == 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int countZero = 0;
        for (int i = 0; i < total1; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }
        int start = 0;
        for (int i = total1; i < arr.length; i++) {
            min = Math.min(min, countZero);
            if (arr[i] == 0) {
                countZero++;
            }
            if (arr[start] == 0) {
                countZero--;
            }
            start++;
        }
        min = Math.min(min, countZero);
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0 };
        System.out.println(minSwaps(arr));
    }
}
