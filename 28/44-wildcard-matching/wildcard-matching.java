class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0, starIndex = -1, iIndex = -1;
        int m = s.length(), n = p.length();

        while (i < m) {
            if (j < n && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            } else if (j < n && p.charAt(j) == '*') {
                starIndex = j;
                iIndex = i;
                j++;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = iIndex + 1;
                iIndex++;
            } else {
                return false;
            }
        }

        while (j < n && p.charAt(j) == '*') {
            j++;
        }

        return j == n;
    }
}
