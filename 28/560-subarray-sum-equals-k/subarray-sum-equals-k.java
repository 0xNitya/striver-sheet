import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); 
        
        int pre = 0;
        int count = 0;

        for (int num : nums) {
            pre += num;
            if (prefixCount.containsKey(pre - k)) {
                count += prefixCount.get(pre - k);
            }
            prefixCount.put(pre, prefixCount.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
