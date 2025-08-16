class Solution {
    public int countDigitOne(int n) {
        long count = 0;
        long p = 1;
        
        while (p <= n) {
            long high = n / (p * 10);
            long curr = (n / p) % 10;
            long low = n % p;

            if (curr == 0) count += high * p;
            else if (curr == 1) count += high * p + low + 1;
            else count += (high + 1) * p;

            p *= 10;
        }
        return (int) count;
    }
}
