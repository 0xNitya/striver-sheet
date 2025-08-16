class Solution {
    public boolean isPerfectSquare(int num) {
        int sq=(int)Math.sqrt(num);
        if(sq*sq==num){return true;}
        return false;
    }
}