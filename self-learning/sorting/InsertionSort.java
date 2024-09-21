public class InsertionSort {
    public static void insertionSort(int nums[]) {
      for (int i = 1; i < nums.length; i++) {
        int temp = nums[i];
        int prev = i - 1;
        while (prev >= 0 && nums[prev] > temp) {
          nums[prev + 1] = nums[prev];
          prev--;
        }
        nums[prev + 1] = temp;
      }
    }
  
    public static void main(String args[]) {
      int nums[] = { 4, 5, 2, 1, 3, 6 };
      insertionSort(nums);
      for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
      }
      System.out.println();
    }
  }