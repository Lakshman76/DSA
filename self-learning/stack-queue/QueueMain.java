public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.add(5);
        queue.add(10);
        queue.add(35);
        queue.add(51);
        queue.add(25);

        // queue.display();

        // System.out.println(queue.remove());

        // queue.display();
        // System.out.println(queue.peek());

        CircularQueue cQueue = new CircularQueue(5);
        cQueue.add(7);
        cQueue.add(9);
        cQueue.add(1);
        cQueue.add(4);
        cQueue.add(8);

        cQueue.display();

        System.out.println(cQueue.peek());
        cQueue.remove();
        cQueue.remove();
        cQueue.add(9);
        cQueue.add(7);
        System.out.println(cQueue.peek());

        cQueue.display();
    }
}
