package ll;

class AddOneINLL {
    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static ListNode addOne(ListNode head) {
        ListNode newhead = reverseList(head);
        ListNode current = newhead,current1=newhead;
        ListNode prev = null;
        int carry = 0;

        while (current != null) {
            int sum = 0;
            if (prev == null) {
                sum = current.val + 1;
            } else {
                sum = current.val + carry;
            }
            carry = sum / 10;
            current.val = sum % 10;
            prev = current;
            current = current.next;
        }

        if (carry == 1) {
            prev.next = new ListNode(carry);
        }
        return reverseList(current1);
    }
}