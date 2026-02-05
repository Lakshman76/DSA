public class HeapMain {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(50);
        heap.insert(30);
        heap.insert(60);
        heap.insert(40);
        heap.insert(70);
        heap.insert(20);

        heap.display();

        System.out.println(heap.remove());
        System.out.println(heap.remove());

        heap.display();
    }
}
