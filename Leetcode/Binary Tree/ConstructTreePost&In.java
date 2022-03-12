class Solution {
    static int index;

    public static TreeNode buildTree(int[] inorder, int[] postorder, int start, int end, Map<Integer, Integer> map) {
        if (start > end)
            return null;
        int curr = postorder[index--];
        TreeNode node = new TreeNode(curr);
        if (start == end)
            return node;

        int inIndex = map.get(curr);
        TreeNode right = buildTree(inorder, postorder, inIndex + 1, end, map);
        TreeNode left = buildTree(inorder, postorder, start, inIndex - 1, map);
        node.left = left;
        node.right = right;
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        index = 0;
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        index = postorder.length - 1;
        return buildTree(inorder, postorder, 0, postorder.length - 1, map);
    }

    
    
}   
