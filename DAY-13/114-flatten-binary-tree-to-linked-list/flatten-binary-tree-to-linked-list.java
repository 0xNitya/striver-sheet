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

 // put root ka right first then left 
 // right will become top of stack and left will be null until stack isnt empty.
class Solution {
    public void flatten(TreeNode root) {
        if(root==null){return;}
        Deque<TreeNode>st=new ArrayDeque<>();
        st.push(root);
        while(!st.isEmpty())
        {
            root=st.pop();
            if(root.right!=null){st.push(root.right);}
            if(root.left!=null){st.push(root.left);}
            if(!st.isEmpty())
            {
                root.right=st.peek();

            }
            root.left=null;
        }
        
    }
}