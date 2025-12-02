class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveDuplicate {
    ListNode head;

    void insert(int data) {
        ListNode newListNode = new ListNode(data);
        if (head == null) {
            head = newListNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newListNode;
    }

    private ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ListNode current = head.next;
        while (current != null) {
            if (node.val != current.val) {
                node.next = current;
                node = current;
            }
            current = current.next;
        }
        node.next = null;
        return head;
    }

    private ListNode deleteDuplicates2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    void removeDuplicate() {
        head = deleteDuplicates(head);
        head = deleteDuplicates2(head);
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
        RemoveDuplicate ll = new RemoveDuplicate();
        ll.insert(10);
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(30);
        ll.display();

        ll.removeDuplicate();
        ll.display();
    }
}
