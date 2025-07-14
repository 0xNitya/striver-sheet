import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair<String, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(beginWord, 1));

        Set<String> st = new HashSet<>(wordList);

        if (!st.contains(endWord)) return 0; // endWord must be in wordList

        st.remove(beginWord);

        while (!q.isEmpty()) {
            String word = q.peek().getKey();
            int steps = q.peek().getValue();
            q.remove();

            if (word.equals(endWord)) return steps;

            for (int i = 0; i < word.length(); i++) {
                char[] replaced = word.toCharArray();

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    replaced[i] = ch;
                    String replacedWord = new String(replaced);

                    if (st.contains(replacedWord)) {
                        st.remove(replacedWord);
                        q.add(new Pair<>(replacedWord, steps + 1));
                    }
                }
            }
        }

        return 0;
    }
}
