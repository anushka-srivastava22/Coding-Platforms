class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       ListNode slow=head,fast=head;
        while(k-- >1){
            fast=fast.next;
        }
    
        ListNode ans= fast;
    
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode a=slow;
        int temp=ans.val;
        ans.val=a.val;
        a.val=temp;
    
        return head; 
    }
}
