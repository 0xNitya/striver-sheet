class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int ans = 10; 
        int unique = 9; 
        int available = 9; 

        for (int k = 2; k <= n && available > 0; k++) {
            unique *= available; 
            ans += unique;
            available--; 
        }

        return ans;
    }
}
