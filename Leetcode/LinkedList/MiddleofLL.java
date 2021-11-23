class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp!=null)
        {
            temp = temp.next;
            length = length + 1;
            
        }
        temp = head;
        int count = 0;
        while(count < length/2)
        {
            temp = temp.next;
            count++;
        }
        return temp;
    }
}
