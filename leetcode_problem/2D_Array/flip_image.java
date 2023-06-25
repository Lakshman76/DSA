 // Question link - https://leetcode.com/problems/flipping-an-image/

 // Solution - 

 class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // flip
        for(int i=0; i<image.length; i++){
            int start = 0;
            int end = image.length-1;
            while(start < end){
                int temp = image[i][start];
                image[i][start++] = image[i][end];
                image[i][end--] = temp;
            }
            // Inverse
            for(int j=0; j<image.length; j++){
                image[i][j] = (image[i][j] == 0) ? 1 : 0;
            }
        }
        return image;
    }
}