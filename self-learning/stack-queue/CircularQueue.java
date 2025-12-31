public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean add(int item) {
        if (isFull()) {
            throw new Error("Queue is full!");
        }
        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            throw new Error("Queue is Empty!");
        }
        int removed = data[front++];
        front %= data.length;
        size--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            throw new Error("Queue is Empty!");
        }
        return data[front];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        for (int i = front; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        int i = front;
        do {
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("End");
    }
}
