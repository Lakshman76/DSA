public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.add(5);
        queue.add(10);
        queue.add(35);
        queue.add(51);
        queue.add(25);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
        System.out.println(queue.peek());
    }
}
