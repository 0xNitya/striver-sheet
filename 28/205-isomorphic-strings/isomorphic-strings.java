class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer>ms=new HashMap<>();
        Map<Character,Integer>mt=new HashMap<>();

        for(Integer i=0;i<s.length();i++)
        {
            if(ms.put(s.charAt(i),i)!=mt.put(t.charAt(i),i))
            return false;
        }
        return true;
    }
}