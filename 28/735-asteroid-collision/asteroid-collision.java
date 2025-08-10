class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        //Input: asteroids = [5,10,-5]   Output: [5,10]
        for (int a : asteroids) { //a=10
            boolean alive = true;
            while (!st.isEmpty() && a < 0 && st.peek() > 0) {  // ++ a-> b->  a-> b<-
                if (st.peek() < -a) {   // 
                    st.pop(); // top fatega
                } else if (st.peek() == -a) {
                    st.pop(); // both fatenge  // 5==-10
                    alive = false;
                    break;
                } else {
                    alive = false; // incoming fatega break
                    break;
                }
            }
            if (alive) {
                st.push(a);  //(5,10)
            }
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
