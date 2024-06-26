public class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {return head;}
        int size;
        ListNode oldTail = head;
        for (size = 1; oldTail.next != null ;size++ ) {
            oldTail = oldTail.next;
        }
        oldTail.next = head;
        k = k % size;
        ListNode newTail = head;
        ListNode newHead = head;
        for ( int i = 1; i < size - k ; i++){
            newTail = newTail.next;
        }
        newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}