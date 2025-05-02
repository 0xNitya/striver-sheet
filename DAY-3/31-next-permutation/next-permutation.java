class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i;

        // Step 1: Find the first decreasing element from the end
        for (i = n - 2; i >= 0; --i) {
            if (nums[i] < nums[i + 1]) break;
        }

        // Step 2: If found, find the next greater element and swap
        if (i >= 0) {
            for (int j = n - 1; j > i; --j) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                }
            }
        }

        // Step 3: Reverse the decreasing sequence
        reverse(nums, i + 1, n - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r)
            swap(nums, l++, r--);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
