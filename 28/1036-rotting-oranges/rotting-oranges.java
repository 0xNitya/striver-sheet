class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fc=0;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==2){q.offer(new int[]{i,j});}
                else if(grid[i][j]==1){fc++;}
            }
        }
        if(fc==0){return 0;}
        int minutes = 0;
        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        // Step 2: BFS to rot adjacent fresh oranges
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottedThisMinute = false;

            for (int i = 0; i < size; i++) {
                int[] pos = q.poll();
                int r = pos[0], c = pos[1];

                for (int[] dir : directions) {
                    int nr = r + dir[0], nc = c + dir[1];

                    if (nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;  // rot the fresh orange
                        q.offer(new int[] {nr, nc});
                        fc--;
                        rottedThisMinute = true;
                    }
                }
            }
            if (rottedThisMinute) minutes++;
        }

        return fc == 0 ? minutes : -1;

    }
}