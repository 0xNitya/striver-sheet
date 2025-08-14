class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] arr = new int[n * n + 1]; // 1-based indexing
        int idx = 1;
        boolean leftToRight = true;

        //  1D array
        for (int r = n - 1; r >= 0; r--) {
            if (leftToRight) {
                for (int c = 0; c < n; c++) {
                    arr[idx++] = board[r][c];
                }
            } else {
                for (int c = n - 1; c >= 0; c--) {
                    arr[idx++] = board[r][c];
                }
            }
            leftToRight = !leftToRight;
        }

        boolean[] visited = new boolean[n * n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visited[1] = true;
        int moves = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                if (curr == n * n) return moves;

                for (int roll = 1; roll <= 6 && curr + roll <= n * n; roll++) {
                    int next = curr + roll;
                    if (arr[next] != -1) {
                        next = arr[next]; // sanp ya sidhi
                    }
                    if (!visited[next]) {
                        visited[next] = true;
                        q.offer(next);
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}
