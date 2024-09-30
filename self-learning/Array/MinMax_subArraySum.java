public class MinMax_subArraySum {

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
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