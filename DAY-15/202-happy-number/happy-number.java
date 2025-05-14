//sqrsum(n) funcn to find sum of squares 
//slow=sqrsum(n) fast=sqrsum(sqrsum(n))
//slow 1 step fast 2 step return slow ==1


class Solution {
    public boolean isHappy(int n) {
        int slow=sqrsum(n);
        int fast=sqrsum(sqrsum(n));
        while(slow!=fast)
        {
            slow=sqrsum(slow);
            fast=sqrsum(sqrsum(fast));
        }
        return slow==1;
        
    }

    private int sqrsum(int n)
    {
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}