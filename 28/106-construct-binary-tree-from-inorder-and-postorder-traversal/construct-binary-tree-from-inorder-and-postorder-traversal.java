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
    int postidx;
    Map<Integer,Integer> inordermpp;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postidx=postorder.length-1;
        inordermpp=new HashMap<>();

        for(int i=0;i<inorder.length;i++)
        {
            inordermpp.put(inorder[i],i);
        }
        return helper(inorder,postorder,0,inorder.length-1);
    }

    private TreeNode helper(int inorder[],int postorder[],int ins,int ine)
    {
        if(ins>ine){return null;}
        int rootval=postorder[postidx--];
        TreeNode root=new TreeNode(rootval);
        int inidx=inordermpp.get(rootval);

        root.right=helper(inorder,postorder,inidx+1,ine);
        root.left=helper(inorder,postorder,ins,inidx-1);
        return root;
    }
}