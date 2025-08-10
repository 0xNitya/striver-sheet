class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];

        Deque<Integer>st=new ArrayDeque<>();
        //st()
        //Input: temperatures = [73,74,75,71,69,72,76,73]  Output: [1,1,4,2,1,1,0,0]   ans[0,0,0,0,0,0,0,0]
        for(int i=0;i<temperatures.length;i++) //i=5
        {
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i])  // 
            {
                int idx=st.pop(); // idx=5
                ans[idx]=i-idx;  //  ans[4]
                //ans[1,1,0,0,1,0,0,0]  
            }
            st.push(i);  //st(2,3,4)
        }
        return ans;
    }
}