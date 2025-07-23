class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int carry=target-nums[i];
            if(mpp.containsKey(carry))
            {
                return new int[] {mpp.get(carry),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[0];
    }
}