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
    private ListNode reverseRec(ListNode node) {
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

    void reverseRec() {
        head = reverseRec(head);
    }

    // In place reversal
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 1; curr != null && i < left; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode newEnd = curr;
        ListNode last = prev;
        prev = null;
        ListNode next = curr.next;
        for (int i = left; curr != null && i <= right; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = curr;
        return head;
    }
    void reverse() {
        head = reverseBetween(head, 3, 6);
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
        rl.insert(8);
        rl.insert(7);
        rl.insert(6);
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
