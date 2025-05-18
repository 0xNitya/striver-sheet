class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        final int n=Math.min(word1.length(),word2.length());
        for(int i=0;i<n;++i)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        return sb.append(word1.substring(n)).append(word2.substring(n)).toString();
    }
}