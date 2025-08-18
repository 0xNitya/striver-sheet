class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
     
        Set<List<Integer>> set = new LinkedHashSet<>();
        
        set.add(toList(nums));
        
        while (nextPermutation(nums)) {
            set.add(toList(nums));
        }
        
        result.addAll(set);
        return result;
    }
    
  
    private List<Integer> toList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);
        return list;
    }
    
    
    private boolean nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        
        if (i < 0) return false; 
        
        int j = nums.length - 1;
        while (nums[j] <= nums[i]) j--;
        
        swap(nums, i, j);
        reverse(nums, i + 1, nums.length - 1);
        return true;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int i, int j) {
        while (i < j) swap(nums, i++, j--);
    }
}
