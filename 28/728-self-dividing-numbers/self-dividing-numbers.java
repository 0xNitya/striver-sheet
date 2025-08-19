class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if(check(i)) ans.add(i);
        }
        return ans;
    }

    static boolean check(int n) {
        int og = n;
        while(n > 0) {
            int rem = n % 10;
            if(rem == 0 || og % rem != 0) return false;
            n /= 10;
        }
        return true;
    }
}
