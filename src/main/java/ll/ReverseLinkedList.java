package ll;
/*
  @created 03/11/22
  @author  manish.mandora
*/

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
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

    static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reve = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reve;
    }


}
