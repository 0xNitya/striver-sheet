class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int c=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1){
                c++;
                max=Math.max(c,max);
            }
            else c=0;
        }
        return max;
    }
}