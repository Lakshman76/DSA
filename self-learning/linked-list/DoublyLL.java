class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLL {
    Node head;

    void insertFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void insertLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert new node after a given node.
    void insert(int after, int val) {
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.data != after && temp.next != null) {
            temp = temp.next;
        }
        if (temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
            return;
        }

        Node nextNode = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = nextNode;
        nextNode.prev = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL \n");
    }

    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertLast(40);
        ll.insertLast(50);
        ll.display();

        ll.insert(10, 35);
        ll.display();
    }
}
