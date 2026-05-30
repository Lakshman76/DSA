// https://www.geeksforgeeks.org/problems/replace-with-xor-of-adjacent/1
public class ReplaceElements {
    static void replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[i] = arr[i] ^ arr[i + 1];
            } else if (i == n - 1) {
                result[i] = arr[i] ^ arr[i - 1];
            } else {
                result[i] = arr[i - 1] ^ arr[i + 1];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 9, 2, 6, 7 };
        replaceElements(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
