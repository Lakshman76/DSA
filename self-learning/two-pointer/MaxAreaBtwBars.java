// https://www.geeksforgeeks.org/problems/dam-of-candies--141631/1

public class MaxAreaBtwBars {
    static int maxArea(int[] height) {
        int maxAr = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high) {
            int min;
            if (height[low] <= height[high]) {
                min = height[low];
                low++;
            } else {
                min = height[high];
                high--;
            }
            maxAr = Math.max(maxAr, min * (high - low));
        }
        return maxAr;
    }

    public static void main(String[] args) {
        int[] height = { 2, 5, 4, 3, 7 };
        System.out.println(maxArea(height));
    }
}
