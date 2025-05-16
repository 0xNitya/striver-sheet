class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int curr=0;
        for(final int g :gain)
        {
            curr+=g;
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}