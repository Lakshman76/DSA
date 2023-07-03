// Question 8 

// You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

// Example 1
// Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
// Output: true

// Solution - 

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true; // If there are less than or equal to two points, they will always form a straight line.
        }
        
        int x0 = coordinates[0][0]; // X-coordinate of the first point
        int y0 = coordinates[0][1]; // Y-coordinate of the first point
        int x1 = coordinates[1][0]; // X-coordinate of the second point
        int y1 = coordinates[1][1]; // Y-coordinate of the second point
        
        // Calculate the slope between the first two points
        int deltaX = x1 - x0;
        int deltaY = y1 - y0;
        
        // Check if the remaining points lie on the same line
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0]; // X-coordinate of the current point
            int y = coordinates[i][1]; // Y-coordinate of the current point
            
            // If the current point does not lie on the same line, return false
            if ((y - y0) * deltaX != (x - x0) * deltaY) {
                return false;
            }
        }
        
        return true; // All points lie on the same line
    }
}