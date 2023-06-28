// Question 8
// Given an array of meeting time intervals where intervals[i] = [starti, endi],
// determine if a person could attend all meetings.

// Example 1:
// Input: intervals = [[0,30],[5,10],[15,20]]
// Output: false

// solution - 

public class Q8_meeting_room {
    function canAttendMeetings(intervals) {
        // Sort the intervals in ascending order of start time
        intervals.sort((a, b) => a[0] - b[0]);

        // Loop through the intervals and check for overlaps
        for (let i = 0; i < intervals.length - 1; i++) {
            // If the end time of the current interval is greater than or equal to
            // the start time of the next interval, there is an overlap and we can't
            // attend all the meetings
            if (intervals[i][1] > intervals[i+1][0]) {
                return false;
            }
        }

        // If there are no overlaps, we can attend all the meetings
        return true;
    };
}