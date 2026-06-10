// https://www.geeksforgeeks.org/problems/binary-searchable-elements/1

public class BinarySearchable {
    static boolean binarySearch(int[] arr, int n) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == n)
                return true;
            else if (arr[mid] < n)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }

    static int binarySearchable(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (binarySearch(arr, arr[i]))
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 4, 6 };
        System.out.println(binarySearchable(arr));
    }
}
