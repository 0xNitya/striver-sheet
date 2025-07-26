class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
            boolean alive = true;

            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                if (st.peek() < -a) {
                    st.pop(); // top fatega
                } else if (st.peek() == -a) {
                    st.pop(); // both fatenge
                    alive = false;
                    break;
                } else {
                    alive = false; // incoming fatega
                    break;
                }
            }
            if (alive) {
                st.push(a);
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
