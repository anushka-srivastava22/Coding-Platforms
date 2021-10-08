public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;
        if(head == null || head.next == null || head.next.next == null)
        {
            return false;
        }
        while(fastptr.next != null && fastptr.next.next != null)
        {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr == fastptr)
            {
                return true;
            }
        }
        return false;
        
    }
}
