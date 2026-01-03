import java.util.Stack;

public class QueueUsingStack {

    // Insertion Efficient
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int top = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return top;
    }

    public boolean empty() {
        return first.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack obj = new QueueUsingStack();
        obj.push(10);
        obj.push(20);
        obj.push(15);

        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println(param_2 + " " + param_3 + " " + param_4);
    }

}