class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currminsum=0;
        int currmaxsum=0;
        int totalsum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for(final int num:nums)
        {
            totalsum+=num;
            currmaxsum=Math.max(currmaxsum+num,num);
            currminsum=Math.min(currminsum+num,num);
            maxsum=Math.max(maxsum,currmaxsum);
            minsum=Math.min(minsum,currminsum);

        }
        return maxsum < 0 ? maxsum : Math.max(maxsum, totalsum - minsum);
    }
}