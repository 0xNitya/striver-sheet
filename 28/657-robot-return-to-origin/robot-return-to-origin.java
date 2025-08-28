class Solution {
    public boolean judgeCircle(String moves) {
        int l=0;int r=0;int up=0;int down=0;

        for(char c:moves.toCharArray())
        {
            if(c=='U'){up++;}
            else if(c=='D'){down++;}
            else if(c=='L'){l++;}
            else r++;
        }

        return (up==down && l==r);
    }
}