import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    public void insert(T val) {
        list.add(val);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if (index == 0) {
            return;
        }
        int parent = parent(index);
        if (list.get(index).compareTo(list.get(parent)) < 0) {
            swap(index, parent);
            upheap(parent);
        }
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();
    }
}
