import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        int ans[] = new int[m * n];
        for (int i = 0; i < m * n; i++) {
            ans[i] = matrix[i / n][i % n];
        }

        Arrays.sort(ans);
        return ans[k - 1];  
    }
}
