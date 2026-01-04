import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    // Removal Efficient
    public void push(int x) {
        if (first.isEmpty()) {
            first.push(x);
        } else {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            first.push(x);
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
        }
    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
        return first.peek();
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