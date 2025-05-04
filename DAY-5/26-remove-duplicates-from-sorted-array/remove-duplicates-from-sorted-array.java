class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
//i =0 , loop chlana hai j=0 -> n . agar a[i]=a[j] do ntg. else i++; and a[i]=a[j]. return i+1
        
    }
}