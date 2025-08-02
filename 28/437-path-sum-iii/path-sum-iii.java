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
public class Solution {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;

        long longSum = (long) sum;

        return pathsFrom(root, longSum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathsFrom(TreeNode node, long sum) {
        if (node == null) return 0;

        long longVal = (long) node.val;
        return (longVal == sum ? 1 : 0) + pathsFrom(node.left, sum - longVal) + pathsFrom(node.right, sum - longVal);
    }
}