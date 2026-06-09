// https://www.geeksforgeeks.org/problems/seating-arrangement--170647/1

public class SittingArrangement {
    static boolean canSeatAllPeople(int k, int[] seats) {
        if (seats.length == 1) {
            if (seats[0] == 0 && k <= 1)
                return true;
            if (seats[0] == 1 && k >= 1)
                return false;
        }
        int first = 0;
        int second = 1;
        int third = 2;
        while (second < seats.length) {
            if (first == 0) {
                if (seats[first] == 0 && seats[second] == 0) {
                    seats[first] = 1;
                    k--;
                }
            } else if (second == seats.length - 1) {
                if (seats[first] == 0 && seats[second] == 0) {
                    seats[second] = 1;
                    k--;
                }
            } else if (seats[first] == 0 && seats[second] == 0 && seats[third] == 0) {
                seats[second] = 1;
                k--;
            }
            if (seats[first] == 1 && seats[second] == 1) {
                return false;
            }
            first++;
            second++;
            third++;
        }
        return k <= 0;
    }

    public static void main(String[] args) {
        int[] seats = {  0,0,0, 1,1 };
        int k = 0;
        System.out.println(canSeatAllPeople(k, seats));
    }
}
