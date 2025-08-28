class Solution {
    public int arrangeCoins(long n) {
        int rows = 0;
        while (n >= rows + 1) {
            rows++;
            n -= rows;
        }
        return rows;
    }
}
