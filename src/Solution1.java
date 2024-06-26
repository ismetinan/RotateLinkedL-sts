public class Solution1 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy1 = head;
        int size = 0;
        while (dummy1 != null) {
            dummy1 = dummy1.next;
            size++;
        }
        int N = k % size;
        ListNode dummyHead = head;
        ListNode dummy2 = head;
        ListNode newHead = head;
        for ( int i = 0; i < size ; i++){
            dummy2 = dummy2.next;
            if (i == size - N) {
                newHead = dummy2;
            }
        }
        dummy2.next = dummyHead;
        
        return newHead;
    }
}