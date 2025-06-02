class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(a->a[1]));
        int ans=1;
        int arrowx=points[0][1];
        for(int i=1;i<points.length;++i)
        {
            if(points[i][0]>arrowx)
            {
                arrowx=points[i][1];
                ++ans;
            }
        }
        return ans;
        
    }
}