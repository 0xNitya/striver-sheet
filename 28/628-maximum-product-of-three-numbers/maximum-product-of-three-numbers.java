class Solution {
    public int maximumProduct(int[] nums) {
          // 1223 123 1234 
        int n=nums.length;
        Arrays.sort(nums);
        int case1=nums[n-1]*nums[0]*nums[1];
        int case2=nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(case1,case2);
    }
}