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

public class AddNumber {
    ListNode head;

    private void insert(int data, ListNode last) {
        ListNode newNode = new ListNode(data);
        last.next = newNode;
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode last = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 == null) {
                sum += 0;
            } else {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 == null) {
                sum += 0;
            } else {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            insert(sum % 10, last);
            last = last.next;
            carry = sum / 10;
        }
        if (carry != 0) {
            insert(carry, last);
        }
        return head.next;
    }

    void addTwoNumbers() {
        ListNode l1 = new ListNode(9);
        insert(5, l1);
        insert(3, l1.next);
        ListNode l2 = new ListNode(4);
        insert(4, l2);
        insert(7, l2.next);
        head = addTwoNumbers(l1, l2);
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
        AddNumber add = new AddNumber();
        add.addTwoNumbers();
        add.display();
    }
}
