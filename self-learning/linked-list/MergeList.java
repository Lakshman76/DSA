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
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode head = null;
        ListNode node = null;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode newNode = new ListNode(list1.val);
                if (head == null) {
                    head = newNode;
                    node = head;
                } else {
                    node.next = newNode;
                    node = newNode;
                }
                list1 = list1.next;
            } else {
                ListNode newNode = new ListNode(list2.val);
                if (head == null) {
                    head = newNode;
                    node = head;
                } else {
                    node.next = newNode;
                    node = newNode;
                }
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            ListNode newNode = new ListNode(list1.val);
            node.next = newNode;
            node = newNode;
            list1 = list1.next;
        }
        while (list2 != null) {
            ListNode newNode = new ListNode(list2.val);
            node.next = newNode;
            node = newNode;
            list2 = list2.next;
        }
        return head;
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
