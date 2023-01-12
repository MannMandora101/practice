package ll;
/*
  @created 03/11/22
  @author  manish.mandora
*/

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode mid = findMid(head);
        ListNode last = reverse(mid);
        ListNode curr = head;

        while (last != null) {
            if (last.val != curr.val) {
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
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

    private ListNode findMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
