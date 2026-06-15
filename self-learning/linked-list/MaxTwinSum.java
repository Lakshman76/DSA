// 2130. Maximum Twin Sum of a Linked List
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

public class MaxTwinSum {
    static ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        ListNode nextp = node.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = nextp;
            if (nextp != null) {
                nextp = nextp.next;
            }
        }
        return prev;
    }

    static int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversed = reverse(slow);
        ListNode temp = head;
        int maxSum = Integer.MIN_VALUE;
        while (temp != slow || reversed != null) {
            maxSum = Math.max(maxSum, temp.val + reversed.val);
            temp = temp.next;
            reversed = reversed.next;
        }
        return maxSum;
    }
}
