public class SubArraySum {

    public static void subArraySum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
          for (int j = i; j < arr.length; j++) {
            int sum = 0;
            for (int k = i; k <= j; k++) {
              sum += arr[k];
              System.out.print(arr[k] + " ");
            }
            System.out.print(" Sum is " + sum);
            System.out.println();
          }
          System.out.println();
        }
      }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        subArraySum(arr);
    }
}