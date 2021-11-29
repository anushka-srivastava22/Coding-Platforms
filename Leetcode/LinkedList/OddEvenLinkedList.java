class Solution {
   public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenStart = even;
        
        while ((even != null && odd != null) && (even.next != null && odd.next != null)) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        
        odd.next = evenStart;
        
        return head;
    }
}
