class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;  // negative aur zero allowed nahi

        while (n % 4 == 0) {  // jab tak 4 se divisible hai divide karo
            n /= 4;
        }

        return n == 1;
    }
}
