import java.util.ArrayList;

public class HeapMain {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(50);
        heap.insert(30);
        heap.insert(60);
        heap.insert(40);
        heap.insert(70);
        heap.insert(20);
        heap.insert(10);
        heap.insert(55);
        heap.insert(45);
        heap.insert(65);

        heap.display();

        System.out.println(heap.remove());
        System.out.println(heap.remove());

        heap.display();

        // heap sort
        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
    }
}
