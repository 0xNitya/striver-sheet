// class Solution {
//     public int maxOperations(int[] nums, int k) {
//         int count = 0;
//         boolean[] used = new boolean[nums.length]; 

//         for (int i = 0; i < nums.length; i++) {
//             if (used[i]) continue; 
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (!used[j] && nums[i] + nums[j] == k) {
//                     count++;
//                     used[i] = true;
//                     used[j] = true;
//                     break; 
//                 }
//             }
//         }

//         return count;
//     }
// }


class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int num : nums) {
            int complement = k - num;
            if (map.getOrDefault(complement, 0) > 0) {
                count++;
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        
        return count;
    }
}
