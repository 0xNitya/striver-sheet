class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewel = jewels.toCharArray();
        char[] stone = stones.toCharArray();

        int ct = 0;
        for (int i = 0; i < stone.length; i++) {
            for (int j = 0; j < jewel.length; j++) {
                if (stone[i] == jewel[j]) {
                    ct++; 
                    break; 
                }
            }
        }

        return ct;
    }
}
