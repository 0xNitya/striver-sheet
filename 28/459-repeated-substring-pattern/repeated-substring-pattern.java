class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) { 

                String sub = s.substring(0, len);  // ab
                int repeat = n / len;    // abab/ab = ab
                StringBuilder sb = new StringBuilder();  
                for (int i = 0; i < repeat; i++) {
                    sb.append(sub);  //ab
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
