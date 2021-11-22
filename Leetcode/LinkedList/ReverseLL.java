class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null) //loop will be executed till current has value
        {
            next = current.next;//store value of next node
            current.next = prev;//next pointer store prev value 
            prev = current;//prev stores value of current 
            current = next;//current is moved forward to next node which is stored in next

        }
        head = prev;
        return head;
    }
}
