import java.util.*;
import java.util.function.BinaryOperator;

class Solution {
    public int evalRPN(String[] tokens) {
        final Map<String, BinaryOperator<Long>> op = Map.of(
            "+", (a, b) -> a + b,
            "-", (a, b) -> a - b,
            "*", (a, b) -> a * b,
            "/", (a, b) -> a / b
        );
        
        Deque<Long> st = new ArrayDeque<>();
        
        for (final String token : tokens) {
            if (op.containsKey(token)) {
                final long b = st.pop();
                final long a = st.pop();
                st.push(op.get(token).apply(a, b));
            } else {
                st.push(Long.parseLong(token));
            }
        }
        
        return st.pop().intValue();
    }
}
