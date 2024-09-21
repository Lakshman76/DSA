public class SelectionSort {

    public static void selectionSort(int nums[]) {
      for (int i = 0; i < nums.length - 1; i++) {
        int smallIndex = i;
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[j] < nums[smallIndex]) {
            smallIndex = j;
          }
        }
        int temp = nums[smallIndex];
        nums[smallIndex] = nums[i];
        nums[i] = temp;
      }
    }
  
    public static void main(String args[]) {
      int nums[] = { 4, 5, 2, 1, 3, 6 };
      selectionSort(nums);
      for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
      }
      System.out.println();
    }
  }