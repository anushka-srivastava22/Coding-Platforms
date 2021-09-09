/*
class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
*/

/*
        Time Complexity: O(N, Q)
        Space Complexity: O(M),

        where N is the number of nodes in the bst, Q is the number of queries
        and M is the complexity of the recursion stack when we will do preorder traversal.
*/
        
import java.util.ArrayList;

public class Solution {
    
    // The count variable will be used to keep the count of node with value in the given range.
    public static int count;

    public static void preorderTraversal(BinaryTreeNode<Integer> currentNode, int l, int r) {

        // Base case, if the node is null then reutrn back.
        if (currentNode == null) {
            return;
        }

        // If the value of the node is within the given range then increase the count by 1.
        if ((currentNode.data >= l) && (currentNode.data <= r)) {
            count++;
        }

        // Call the preorder traversal of the left and right child.
        preorderTraversal(currentNode.left, l, r);
        preorderTraversal(currentNode.right, l, r);
    }

    public static ArrayList<Integer> bstQueries(BinaryTreeNode<Integer> root, int q, int[][] queries) {

        // Initialize the answer array list where we will store the answers of all the queries.
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        // Iterate through all the queries and for each query calculate the number of nodes withing the given range using preorder traversal.
        for (int i = 0; i < q; i++) {
            count = 0;
            preorderTraversal(root, queries[i][0], queries[i][1]);
            answer.add(count);
        }

        // Return the answer array list.
        return answer;
    }

}
