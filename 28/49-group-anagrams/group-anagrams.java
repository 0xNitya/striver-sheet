class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {  //eat
            char[] ch = str.toCharArray(); //[e,a,t]
            Arrays.sort(ch);
            String key = String.valueOf(ch);  //(aet) //ant
            
            // Agar key nahi hai to nayi list daal
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());  //(aet:[],ant:[]) 
            }
            
            // Us key ki list me string add kar
            map.get(key).add(str);  //(aet:[eat,tea,ate],ant:[tan,nat],abt:[bat])
        }
        
        return new ArrayList<>(map.values());
    }
}
