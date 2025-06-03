class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int l=0;
        int r=height.length-1;
        while(l<r)
        {
            final int minh=Math.min(height[l],height[r]);
            ans=Math.max(ans,minh*(r-l));
            if(height[l]<height[r]){++l;}
            else {--r;}
        }
        return ans;
    }
}