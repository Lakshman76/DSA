import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuilt {

    public static void main(String[] args) {

        // In built stack

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(30);
        System.out.println(stack.push(40));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        // In built queue

        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(5);
        queue.add(7);
        queue.add(6);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        // inbuilt Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(7);
        deque.addFirst(6);
        deque.addLast(2);
        deque.add(14);
        System.out.println(deque);
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }
}