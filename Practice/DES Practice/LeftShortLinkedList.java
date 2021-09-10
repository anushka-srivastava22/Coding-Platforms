/**************************************************************

    Following is the class structure of the Node class:

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

**************************************************************/

public class Solution {
	public static Node getListAfterDeleteOperation(Node head){
        // Write your code here.
        if(head == null)
        {
            return head;
        }
        Node curr = head;
        int delVal = -1;
        while(curr.next != null)
        {
            Node temp = new Node(-1);
            if(curr.next.data < curr.data && delVal == -1)
            {
                delVal = curr.next.data;
                temp  = curr.next;
                curr.next = curr.next.next;
            }
        	else if(delVal != -1 && curr.next.data < delVal)
            {
                delVal = curr.next.data;
                temp  = curr.next;
                curr.next = curr.next.next;
            }
            else
            {
                delVal = -1;
                curr = curr.next;
            }
        }
        return head;
    }
}
