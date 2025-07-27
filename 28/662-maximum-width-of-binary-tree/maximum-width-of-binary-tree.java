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
    class Pair {
        TreeNode node;
        int idx;
        Pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int maxWidth = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int minIndex = q.peek().idx;  

            int first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                Pair curr = q.poll();
                int curIdx = curr.idx - minIndex; 

                if (i == 0) first = curIdx;
                if (i == size - 1) last = curIdx;

                if (curr.node.left != null)
                    q.offer(new Pair(curr.node.left, curIdx * 2));
                if (curr.node.right != null)
                    q.offer(new Pair(curr.node.right, curIdx * 2 + 1));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }
}
