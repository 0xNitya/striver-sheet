// class Solution {
//     public TreeNode bstFromPreorder(int[] preorder) {
//         TreeNode root = new TreeNode(preorder[0]);
//         Deque<TreeNode> st = new ArrayDeque<>();
//         st.push(root);

//         for (int i = 1; i < preorder.length; ++i) {
//             TreeNode node = new TreeNode(preorder[i]);
            
//             // If the current value is less than the top of the stack,
//             // it's the left child
//             if (preorder[i] < st.peek().val) {
//                 st.peek().left = node;
//             } else {
//                 TreeNode parent = null;
//                 // Find parent to which this node will be the right child
//                 while (!st.isEmpty() && preorder[i] > st.peek().val) {
//                     parent = st.pop();
//                 }
//                 parent.right = node;
//             }
//             st.push(node);
//         }

//         return root;
//     }
// }
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length - 1);   
    }
    private TreeNode helper(int[] preorder, int start, int end) {
        if(start > end) return null;   
        TreeNode node = new TreeNode(preorder[start]);
        int i;
        for(i=start;i<=end;i++) {
        if(preorder[i] > node.val)
            break;
        }
        node.left = helper(preorder, start+1, i-1);
        node.right = helper(preorder, i, end);
        return node;   
    }   
}