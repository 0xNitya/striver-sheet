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
import java.util.Deque;
import java.util.ArrayDeque;

public class BSTIterator {

    private Deque<TreeNode> st = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        pushLeftUntilNull(root);
    }

    public int next() {
        TreeNode node = st.pop(); // Get the next smallest element
        pushLeftUntilNull(node.right); // Prepare right subtree
        return node.val;
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    private void pushLeftUntilNull(TreeNode node) {
        while (node != null) {
            st.push(node);
            node = node.left;
        }
    }
}
