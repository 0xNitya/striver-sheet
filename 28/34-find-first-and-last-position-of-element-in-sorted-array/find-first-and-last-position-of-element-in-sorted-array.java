class Solution {
    public int[] searchRange(int[] nums, int target) {
        final int l=firstgreatequal(nums,target);
        if(l==nums.length || nums[l]!=target)
        {
            return new int[]{-1,-1};
        }
        final int r=firstgreatequal(nums,target+1)-1;
        return new int[] {l,r};
    }
    private int firstgreatequal(int arr[],int target)
    {
        int l=0;
        int r=arr.length;
        while(l<r)
        {
            final int m=(l+r)/2;
            if(arr[m]>=target){r=m;}
            else l=m+1;
        }
        return l;
    }
}