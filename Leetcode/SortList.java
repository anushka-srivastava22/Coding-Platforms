class Solution {
    public ListNode sortList(ListNode head) {

    if (head == null || head.next == null) return head;

    ListNode mid = middle(head);
    ListNode a = head;
    ListNode b = mid.next;
    mid.next = null;

    a = sortList(a);
    b = sortList(b);

    ListNode temp = mergeList(a, b);
    return temp;
  }

  private ListNode mergeList(ListNode a, ListNode b) {
    if (a == null) return b ;
    else if (b == null) return a;

    ListNode temp;
    if (a.val <= b.val){
         temp = a;
         temp.next = mergeList(a.next, b);
    } else {
        temp = b;
        temp.next = mergeList(a,b.next);
    }
    return temp;
  }
 private ListNode middle(ListNode node) {
    if (node == null) return node;
    ListNode slwPtr = node, fastPtr = node.next;
    while (fastPtr != null && fastPtr.next != null) {
      slwPtr = slwPtr.next;
      fastPtr = fastPtr.next.next;
    }
    return slwPtr;
  }
}
