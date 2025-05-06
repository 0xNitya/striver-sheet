//dfs(s,start,path,ans)
//ispalindrome()


class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void dfs(final String s, int start, List<String> path, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < s.length(); ++i) {
            if (ispalindrome(s, start, i)) {
                path.add(s.substring(start, i + 1)); // take this substring
                dfs(s, i + 1, path, ans);            // explore further
                path.remove(path.size() - 1);        // backtrack
            }
        }
    }

    public boolean ispalindrome(final String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) 
                return false;
        }
        return true;
    }
}
