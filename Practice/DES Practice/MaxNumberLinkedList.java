/*
    Following is the Node class already written for the Singly Linked List

    class LinkedListNode<T>  {
        T data;
        LinkedListNode<T> next;

        public Node(T data)  {
            this.data = data;
        }
    }
*/
import java.util.*;
public class Solution 
{
    public static String findLargestNum(LinkedListNode<Integer> head) 
    {
        //Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        int numberOfZeroes = 0;
        while(head != null)
        {
            if(head.data == 0)
            {
                 numberOfZeroes++;
            }
            list.add(head.data);
            head = head.next;
        }
        if(numberOfZeroes == list.size())
        {
            return "0";
        }
        Collections.sort(list);
        Collections.reverse(list);
        StringBuilder ans = new StringBuilder();
        for(int val : list)
        {
            ans.append(val);
        }
        return ans.toString();
    }
}
