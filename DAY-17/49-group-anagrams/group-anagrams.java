class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> keytoanag=new HashMap<>();
        for(final String str:strs)
        {
            char[]chars=str.toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);
            keytoanag.computeIfAbsent(key,k-> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(keytoanag.values());
    }
}