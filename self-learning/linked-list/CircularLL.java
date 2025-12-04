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
            newNode.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    void insertFIrst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Delete given node
    void delete(int val) {
        if (head == null) {
            return;
        }
        if (head.data == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        Node temp = head;
        do {
            Node n = temp.next;
            if (n.data == val) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }

    int countNodeInCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int count = 0;
                do {
                    slow = slow.next;
                    count++;
                } while (slow != fast);
                return count;
            }
        }
        return 0;
    }

    Node detectCycle(Node head) {
        int length = 0;
        length = countNodeInCycle();
        if (length == 0) {
            return null;
        }
        Node first = head;
        Node second = head;

        while (length > 0) {
            second = second.next;
            length--;
        }

        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

    void findFirstCycle() {
        Node ans = detectCycle(head);
        System.out.println(ans.data);
    }

    void display() {
        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.print("Again " + head.data);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLL ll = new CircularLL();
        ll.insertLast(10);
        ll.insertLast(20);
        ll.insertLast(30);
        ll.insertLast(40);
        ll.insertLast(50);

        ll.display();

        // ll.delete(40);
        // ll.display();

        ll.insertFIrst(8);
        ll.insertFIrst(7);
        ll.insertFIrst(5);
        // ll.display();
        // System.out.println(ll.countNodeInCycle());

        ll.findFirstCycle();
    }
}
