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

        System.out.println(pq);

        System.out.println("Top: " + pq.peek());

        pq.poll();
        pq.poll();

        System.out.println(pq);
    }

    public static void main(String[] args) {
        minHeap();

    }
}
