class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeList {
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

    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode node = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                node.next = list1;
                node = node.next;
                list1 = list1.next;
            } else {
                node.next = list2;
                node = node.next;
                list2 = list2.next;
            }
        }
        node.next = (list1 != null) ? list1 : list2;
        return head.next;
    }

    void merge(ListNode l1, ListNode l2) {
        head = mergeTwoLists(l1, l2);
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
        MergeList l1 = new MergeList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(4);
        l1.display();

        MergeList l2 = new MergeList();
        l2.insert(1);
        l2.insert(3);
        l2.insert(4);
        l2.insert(5);
        l2.display();

        MergeList ans = new MergeList();
        ans.merge(l1.head, l2.head);
        ans.display();
    }
}
