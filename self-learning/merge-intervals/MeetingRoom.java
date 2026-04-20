
// https://www.geeksforgeeks.org/problems/attend-all-meetings-ii/1
import java.util.Arrays;

public class MeetingRoom {
    static int minMeetingRooms(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        int n = start.length;

        int room = 0;
        int i = 0, j = 0;
        int result = 0;
        while (i < n && j < n) {
            if (start[i] < end[j]) {
                room++;
                result = Math.max(result, room);
                i++;
            } else {
                room--;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] start = { 2, 9, 6 };
        int[] end = { 4, 12, 10 };
        System.out.println(minMeetingRooms(start, end));
    }
}
