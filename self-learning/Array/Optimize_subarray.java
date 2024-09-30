public class Optimize_subarray {

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.println(sum);
                if (sum > max)
                    max = sum;
                if (sum < min)
                    min = sum;
            }
        }
        System.out.println("Max sub array sum is " + max);
        System.out.println("Min sub array sum is " + min);
    }
}