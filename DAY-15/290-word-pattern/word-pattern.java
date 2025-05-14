// words array bnake string dalne ka . compare size of pattern and arr
// 2hashmap bnane ka hai then iterate till pattern length
//if chari != words[i] return fale

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(words.length!=pattern.length()){return false;}
        Map<Character,Integer> chari=new HashMap<>();
        Map<String,Integer> stri=new HashMap<>();
        for(Integer i=0;i<pattern.length();++i)
        {
            if(chari.put(pattern.charAt(i),i)!=stri.put(words[i],i))
            return false;
        }
        return true;
    }
}