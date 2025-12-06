class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertFIrst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertAtIndex(int data, int idx){
        if (idx == 0) {
            insertFIrst(data);
            return;
        }
        Node newNode = new Node(data);
        int count = 0;
        Node temp = head;
        while (count != idx - 1) {
            temp = temp.next;
            count++;
        }
        Node nextNode = temp.next;
        temp.next = newNode;
        newNode.next = nextNode;
    }

    private Node insertRecursion(int val, int idx, Node node) {
        if (idx == 0) {
            Node newNode = new Node(val);
            newNode.next = node;
            return newNode;
        }
        node.next = insertRecursion(val, idx - 1, node.next);
        return node;
    }

    void insertRec(int val, int idx) {
        head = insertRecursion(val, idx, head);
    }

    int removeFirst(){
        int val = head.data;
        head = head.next;
        return val;
    }

    int removeLast() {
        int val;
        if (head.next == null) {
            val = head.data;
            head = null;
            return val;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        val = temp.next.data;
        temp.next = null;
        return val;
    }

    int remove(int idx) {
        if (idx == 0) {
            return removeFirst();
        }
        int count = 0;
        Node temp = head;
        while (count != idx - 1) {
            temp = temp.next;
            count++;
        }
        Node nextNode = temp.next.next;
        int val = temp.next.data;
        temp.next = nextNode;
        return val;
    }

    Node find(int val) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    Node middleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void findMiddle() {
        Node mid = middleNode();
        System.out.println(mid.data);
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        // ll.display();

        ll.insertFIrst(15);
        ll.insertFIrst(25);
        ll.insertFIrst(35);
        // ll.display();

        ll.insertAtIndex(12, 3);
        // ll.display();

        // System.out.println(ll.removeFirst());
        // ll.display();

        // System.out.println(ll.removeLast());
        // ll.display();

        // System.out.println(ll.remove(3));
        // ll.display();

        // System.out.println(ll.find(15));
        ll.insertRec(4, 3);
        ll.display();

        ll.findMiddle();
    }
}
