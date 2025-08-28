class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");
        String[] words = paragraph.split("\\s+"); 
        
        Map<String, Integer> map = new HashMap<>();
        String ans = "";
        int maxFreq = 0;
        
        for (String word : words) {
            if (word.length() == 0 || bannedSet.contains(word)) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
            if (map.get(word) > maxFreq) {
                maxFreq = map.get(word);
                ans = word;
            }
        }
        
        return ans;
    }
}
