class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        // for (int i=0;i<n;i++)
        // {
        //     for (int j=i;j<n;j++)
        //     {
        //         int sum=0;
        //         for(int k=i;k<=j;k++)
        //         {
        //             sum+=nums[k];
        //             maxi=Math.max(maxi,sum);
        //         }
        //     }
        // }
        // return maxi;

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];

            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}