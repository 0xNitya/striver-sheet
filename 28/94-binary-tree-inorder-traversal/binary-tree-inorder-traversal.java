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
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    inorder(root, ans);
    return ans;
}

public void inorder(TreeNode root, List<Integer> ans) {
    if (root == null) return;
    inorder(root.left, ans);    // left subtree pe jao
    ans.add(root.val);          // root ko visit karo
    inorder(root.right, ans);   // right subtree pe jao
}
}