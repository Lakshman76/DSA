public class Kadanes {
    public static void kadan(int arr[]) {
      boolean isAllNeg = true;
      int maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 0) {
          isAllNeg = false;
          break;
        }
        maxSum = Math.max(maxSum, arr[i]);
      }
      if (isAllNeg) {
        System.out.println("Maximum sum is: " + maxSum);
        return;
      }
  
      int currentSum = 0;
      maxSum = Integer.MIN_VALUE;
  
      for (int i = 0; i < arr.length; i++) {
        currentSum += arr[i];
        if (currentSum < 0)
          currentSum = 0;
        maxSum = Math.max(maxSum, currentSum);
      }
      System.out.println("Maximum sum is: " + maxSum);
    }
  
    public static void main(String args[]) {
      // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
      int arr[] = { -2, -3, -5, -7 };
      kadan(arr);
    }
  }