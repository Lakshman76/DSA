import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_queue {

    // Min Heap
    static void minHeap() {

        System.out.println("*************************** MIN HEAP *********************************");
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(32);
        pq.add(10);
        pq.offer(22);
        pq.offer(12);
        pq.offer(15);
        pq.offer(20);
        pq.offer(2);

        System.out.println(pq); // [2, 12, 10, 32, 15, 22, 20]

        System.out.println("Top: " + pq.peek()); // 2

        pq.poll();
        pq.poll();

        System.out.println(pq); // [12, 15, 20, 32, 22]
    }

    // Max Heap
    static void maxHeap() {
        System.out.println("*************************** MAX HEAP *********************************");

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(2);
        pq.add(10);
        pq.offer(22);
        pq.offer(12);
        pq.offer(15);
        pq.offer(20);
        pq.offer(32);

        System.out.println(pq); // [32, 15, 22, 2, 12, 10, 20]

        System.out.println("Top: " + pq.peek()); // 32

        pq.poll();
        pq.poll();

        System.out.println(pq); // [20, 15, 10, 2, 12]
    }

    public static void main(String[] args) {
        minHeap();

        maxHeap();
    }
}
