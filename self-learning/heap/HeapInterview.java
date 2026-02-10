public class HeapInterview {
    static int heapHeight(int n, int arr[]) {
        // code here
        if (n == 1)
            return 1;

        // return (int) (Math.log(n) / Math.log(2));

        // or

        // int height = 0;
        // int i = 1;
        // while (i < arr.length) {
        // i = (2 * i) + 1;
        // height++;
        // }

        // or

        int height = 0;

        while (n > 1) {
            height++;
            n = n / 2;
        }

        return height;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 5, 9, 8 };

        System.out.println(heapHeight(arr.length, arr));
    }
}
