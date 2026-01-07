// https://leetcode.com/problems/daily-temperatures/description/
package leetcode_problem.stack_queue;

import java.util.Stack;

public class DailyTemp {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int top = stack.pop();
                temperatures[top] = i - top;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            temperatures[stack.pop()] = 0;
        }
        return temperatures;
    }

    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        System.out.println(dailyTemperatures(temperatures));
    }
}
