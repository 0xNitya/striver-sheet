class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        Deque<Integer>st=new ArrayDeque();

        for(int num:nums2)
        {
            while(!st.isEmpty() && st.peek()<num)
            {mpp.put(st.pop(),num);}
            st.push(num);
        }

        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            res[i]=mpp.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}