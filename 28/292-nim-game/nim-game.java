class Solution {
    public boolean canWinNim(int n) {
        
        if(n%4==0){return false;}n=n%4;
        
        return n==n%4;
    }
}