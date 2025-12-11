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

    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private boolean isPalindrome(ListNode head) {
        ListNode midNode = findMid(head);
        ListNode secondHalf = reverseList(midNode);
        ListNode reversed = secondHalf;
        while (head != null && secondHalf != null) {
            if (head.val != secondHalf.val) {
                break;
            }
            head = head.next;
            secondHalf = secondHalf.next;
        }
        reverseList(reversed);
        return head == null || secondHalf == null;
    }

    void isPalindrome() {
        System.out.println(isPalindrome(head));
    }

    private ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode start = head;
        ListNode mid = findMid(head);
        ListNode reversed = reverseList(mid.next);
        mid.next = null;
        while (start != null && reversed != null) {
            ListNode temp = start.next;
            start.next = reversed;
            start = temp;

            temp = reversed.next;
            reversed.next = start;
            reversed = temp;
        }
        return head;
    }

    void reorderList() {
        head = reorderList(head);
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
        rl.insert(1);
        rl.insert(2);
        rl.insert(3);
        rl.insert(4);
        rl.insert(5);
        // rl.insert(6);
        rl.display();

        // rl.isPalindrome();
        rl.reorderList();
        rl.display();
    }
}
