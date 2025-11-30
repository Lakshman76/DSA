class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLL {
    Node head;
    Node tail;

    void insertLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    void display() {
        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.print("HEAD");
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLL ll = new CircularLL();
        ll.insertLast(10);
        ll.insertLast(20);
        ll.insertLast(30);
        ll.display();
    }
}
