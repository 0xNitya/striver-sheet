class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray())
        {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(freq.get(ch[i])==1){return i;}
        }
        return -1;
    }
}