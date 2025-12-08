class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseList {
    ListNode head;
    ListNode tail;

    void insert(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            tail = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Reverse using recursion

    private ListNode reverseList(ListNode node) {
        if (node == tail) {
            head = node;
            return node;
        }
        reverseList(node.next);
        tail.next = node;
        node.next = null;
        tail = node;
        return head;
    }

    void reverse() {
        head = reverseList(head);
    }

    void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseList rl = new ReverseList();
        rl.insert(5);
        rl.insert(4);
        rl.insert(3);
        rl.insert(2);
        rl.insert(1);
        rl.display();

        rl.reverse();
        rl.display();
    }
}
