// https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
public class Segregate0and1 {
    static void segregate0and1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            while (start < end && arr[start] == 0)
                start++;
            while (start < end && arr[end] == 1)
                end--;

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
        segregate0and1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
