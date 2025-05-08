class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        int ct[]=new int[26];
        for(final char c:s.toCharArray())
        {
            ++ct[c-'a'];
        }

        for(final char c:t.toCharArray())
        {
            if(ct[c-'a']==0){return false;}
            --ct[c-'a'];
        }
        return true;
    }
}