class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int dpmin = nums[0];
        int dpmax = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            final int num = nums[i];
            final int prevMin = dpmin;
            final int prevMax = dpmax;

            if (num < 0) {
                dpmin = Math.min(prevMax * num, num);
                dpmax = Math.max(prevMin * num, num);
            } else {
                dpmin = Math.min(prevMin * num, num);
                dpmax = Math.max(prevMax * num, num);
            }

            ans = Math.max(ans, dpmax);
        }

        return ans;
    }
}
