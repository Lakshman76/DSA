public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public int push(int item) {
        if (isFull()) {
            throw new Error("Stack is full");
        }
        data[++ptr] = item;
        return item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new Error("Stack is empty");
        }
        return data[ptr--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new Error("Stack is empty");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

}
