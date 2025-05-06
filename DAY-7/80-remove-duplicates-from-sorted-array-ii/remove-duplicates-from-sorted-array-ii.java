// int i=0; iterate nums array . store atmost 2 duplicates of each. 
// if(i<2 || num>nums]i-2) store else skip return i;
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(final int num:nums)
        {
            if(i<2 ||num>nums[i-2])
               nums[i++]=num;
        }
        return i;
        
    }
}