//reverse 0 to n-1;
//reverse 0 to k-1 
// reverse k to n-1
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; 
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        
    }
    public void reverse(int nums[],int l,int r)
    {
        while(l<r){swap(nums,l++,r--);}
    }

    public void swap(int nums[],int l ,int r)
    {
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}















